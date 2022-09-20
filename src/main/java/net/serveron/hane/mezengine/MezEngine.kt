package net.serveron.hane.mezengine

import net.serveron.hane.mezengine.example.ExampleGameCommand
import org.bukkit.plugin.java.JavaPlugin

class MezEngine : JavaPlugin() {

    companion object {
        lateinit var plugin: MezEngine
    }

    override fun onEnable() {
        // Plugin startup logic
        plugin = this
        ExampleGameCommand(this)
    }

    override fun onDisable() {
        // Plugin shutdown logic

    }
}