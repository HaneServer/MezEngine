package net.serveron.hane.mezengine.example

import net.serveron.hane.mezengine.flow.Flow
import org.bukkit.Bukkit

class ExampleStart : Flow {
    override fun run() {
        Bukkit.broadcastMessage("GameStart!")
    }
}