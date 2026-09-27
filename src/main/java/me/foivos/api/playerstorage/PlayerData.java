package me.foivos.api.playerstorage;

import java.util.UUID;

public record PlayerData(UUID Id, String Name, PlayerTeam Team, PlayerBalance Balance) {}

