package shadaj

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler


import BukkitImplicits._

class BlockNamerPlugin extends JavaPlugin {

  def handleBlockPlacement = (event: BlockPlaceEvent) => {
    val player = event.getPlayer
    val block = event.getBlockPlaced

    val location = block.getLocation()
    player.sendMessage("You placed a " + block.getType + " at " + "(" + location.getBlockX + "," + location.getBlockY + "," + location.getBlockZ + ")")
  }

  override def onEnable() {
    getServer.getPluginManager.registerEvents(handleBlockPlacement, this);
  }
}