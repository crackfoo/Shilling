// Copyright (c) 2016 Voxy Capital
// Distributed under the MIT/X11 software license, see the accompanying
// file COPYING or http://www.opensource.org/licenses/mit-license.php.

package honeypot;

import com.argo.bukkit.util.BasePermissionsHandler;
import org.bukkit.entity.Player;

public class HoneypotPermissionsHandler extends BasePermissionsHandler {
	public static boolean canBreak(Player player) {
		return checkNode(player, "honeypot.break");
	}

	public static boolean canUseCmd(Player player) {
		return checkNode(player, "honeypot.create");
	}
}
