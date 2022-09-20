package net.serveron.hane.mezengine

import org.bukkit.plugin.java.JavaPlugin

class MezEngine : JavaPlugin() {

    companion object {
        lateinit var plugin: MezEngine
    }

    override fun onEnable() {
        // Plugin startup logic
        plugin = this
    }

    override fun onDisable() {
        // Plugin shutdown logic

    }
}