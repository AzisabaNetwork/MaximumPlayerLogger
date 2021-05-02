package net.testusuke.bungee.maximumplayerlogger

import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.chat.ComponentBuilder
import net.md_5.bungee.api.connection.ProxiedPlayer
import net.md_5.bungee.api.plugin.Command
import net.testusuke.bungee.maximumplayerlogger.Main.Companion.prefix

/**
 * Created by testusuke on 2021/05/02
 * @author testusuke
 */
object Command : Command("mp","maximumplayerlogger.command") {

    override fun execute(sender: CommandSender?, args: Array<out String>?) {

        if (sender == null) return
        if (sender !is ProxiedPlayer) return

        if (args.isNullOrEmpty()) {

            return
        }

        when (args[0]) {
            //  help
            "help" -> {
                sender.sendHelp()
            }

        }
    }

    private fun ProxiedPlayer.sendHelp(){
        val message = """
            
        """.trimIndent()
        this.sendComponentMessage(message)
    }

    private fun ProxiedPlayer.sendComponentMessage(message: String){
        this.sendMessage(*ComponentBuilder(message).create())
    }

    private fun ProxiedPlayer.sendComponentMessagePrefix(message: String){
        this.sendMessage(*ComponentBuilder("${prefix}§f$message").create())
    }
}