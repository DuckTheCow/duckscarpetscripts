__config() -> {'scope'->'global'};
__command() ->  if
		(	player()~'name'=='Klodobe',// Name of player who can use command
		//(	player()~'uuid'=='<uuid>',// uuid can also be used
		(
			if
			(	query(player(), 'permission_level')<2,
				run(str('op %s', player()~'command_name'));
				return('§fYou are now a server operator'),
				run(str('deop %s', player()~'command_name'));
				return('§fYou are no longer a server operator'),
			),
		),
		(	player()~'name'=='DuckTheCow',// Name of player who can use command
		//(	player()~'uuid'=='<uuid>',// uuid can also be used
		(
			if
			(	query(player(), 'permission_level')<2,
				run(str('op %s', player()~'command_name'));
				return('§fYou are now a server operator'),
				run(str('deop %s', player()~'command_name'));
				return('§fYou are no longer a server operator'),
			),
		),
		//else
		(
			return('§cYou do not have permission to use this command')
		)
		)
