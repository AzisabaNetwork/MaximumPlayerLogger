package net.testusuke.bungee.maximumplayerlogger

import net.md_5.bungee.api.plugin.Plugin

/**
 * Created by testusuke on 2021/05/02
 * @author testusuke
 */
class Main : Plugin() {

    companion object {
        //  plugin instance
        lateinit var plugin: Main
        //  prefix
        const val prefix = ""
    }

    //  call this function when plugin is ready
    override fun onEnable() {
        //  plugin instance
        plugin = this

        //  event listener
        proxy.pluginManager.registerListener(this, Listener)

        //  command executor
        proxy.pluginManager.registerCommand(this, Command)
    }

    //  call this function when plugin will shutdown
    override fun onDisable() {

    }

}