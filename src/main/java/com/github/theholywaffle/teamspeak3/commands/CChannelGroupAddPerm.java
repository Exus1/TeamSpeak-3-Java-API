/*******************************************************************************
 * Copyright (c) 2013 Bert De Geyter (https://github.com/TheHolyWaffle).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Bert De Geyter (https://github.com/TheHolyWaffle) - initial API and implementation
 ******************************************************************************/
package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.parameter.KeyValueParam;

public class CChannelGroupAddPerm extends Command {

	public CChannelGroupAddPerm(int groupId, String permName, int permValue) {
		super("channelgroupaddperm");
		add(new KeyValueParam("cgid", groupId));
		add(new KeyValueParam("permsid", permName));
		add(new KeyValueParam("permvalue", permValue));
	}

}
