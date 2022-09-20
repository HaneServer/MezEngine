package net.serveron.hane.mezengine.flow

class Wait(var ms: Long): Flow {

    override fun run() {
        Thread.sleep(ms)
    }
}