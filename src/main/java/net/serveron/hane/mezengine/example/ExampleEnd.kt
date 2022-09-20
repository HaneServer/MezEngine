package net.serveron.hane.mezengine.example

import org.bukkit.Bukkit
import net.serveron.hane.mezengine.flow.Flow

class ExampleEnd : Flow {
    override fun run() {
        Bukkit.broadcastMessage("GameEnd!")
    }
}