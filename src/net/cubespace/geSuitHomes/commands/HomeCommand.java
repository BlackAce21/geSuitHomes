package net.cubespace.geSuitHomes.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.cubespace.geSuitHomes.managers.HomesManager;

public class HomeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(args.length==0){
			Bukkit.getPlayer(sender.getName()).saveData();
			HomesManager.sendHome(sender, "home");
		}else{
			Bukkit.getPlayer(sender.getName()).saveData();
			HomesManager.sendHome(sender, args[0]);
		}
		return true;
	}

}
