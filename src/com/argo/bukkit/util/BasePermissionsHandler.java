// Copyright (c) 2016 Voxy Capital
// Distributed under the MIT/X11 software license, see the accompanying
// file COPYING or http://www.opensource.org/licenses/mit-license.php.

package com.argo.bukkit.util;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import org.bukkit.plugin.java.JavaPlugin;


public class BasePermissionsHandler {
	private static PermissionHandler permissions;

	public static boolean setupPermissions(JavaPlugin plugin) {
		Plugin test = plugin.getServer().getPluginManager().getPlugin("Permissions");
		if (test != null) {
			permissions = ((Permissions)test).getHandler();
			return true;
		} else {
			return false;
		}
	}

	protected static boolean checkNode(Player p, String node){
		if(permissions != null) {
			if(!permissions.permission(p, node))
				return false;
			else
				return true;
		} else {
			return p.isOp();
		}
	}
}
