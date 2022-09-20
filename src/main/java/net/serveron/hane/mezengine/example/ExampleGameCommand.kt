package net.serveron.hane.mezengine.example

import net.serveron.hane.mezengine.core.MezThread
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.command.CommandExecutor
import net.serveron.hane.mezengine.core.MezThread.Flows
import net.serveron.hane.mezengine.flow.Wait
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import java.util.ArrayList

class ExampleGameCommand(plugin: JavaPlugin) : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {

        val flowsList: MutableList<Flows> = ArrayList()
        flowsList.add(Flows(ExampleStart(), true))
        flowsList.add(Flows(Wait(10000), true))
        flowsList.add(Flows(ExampleEnd(), true))
        val thread = Thread(MezThread(flowsList))
        thread.start()

        return true
    }

    init {
        plugin.getCommand("start")!!.setExecutor(this)
    }
}