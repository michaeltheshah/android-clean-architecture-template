package com.mshaw.vin.data.models.response
import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName

@Serializable
data class PokemonResponse(
    @SerialName("abilities")
    val abilities: List<Ability>? = listOf(),
    @SerialName("base_experience")
    val baseExperience: Int? = null,
    @SerialName("forms")
    val forms: List<Form>? = listOf(),
    @SerialName("game_indices")
    val gameIndices: List<GameIndice>? = listOf(),
    @SerialName("height")
    val height: Int? = null,
    @SerialName("held_items")
    val heldItems: List<HeldItem>? = listOf(),
    @SerialName("id")
    val id: Int? = null,
    @SerialName("is_default")
    val isDefault: Boolean? = null,
    @SerialName("location_area_encounters")
    val locationAreaEncounters: String? = null,
    @SerialName("moves")
    val moves: List<Move>? = listOf(),
    @SerialName("name")
    val name: String? = null,
    @SerialName("order")
    val order: Int? = null,
    @SerialName("past_types")
    val pastTypes: List<String>? = listOf(),
    @SerialName("species")
    val species: Species? = null,
    @SerialName("sprites")
    val sprites: Sprites? = null,
    @SerialName("stats")
    val stats: List<Stat>? = listOf(),
    @SerialName("types")
    val types: List<Type>? = listOf(),
    @SerialName("weight")
    val weight: Int? = null
)

@Serializable
data class Ability(
    @SerialName("ability")
    val ability: Attribute? = null,
    @SerialName("is_hidden")
    val isHidden: Boolean? = null,
    @SerialName("slot")
    val slot: Int? = null
)

@Serializable
data class Form(
    @SerialName("name")
    val name: String? = null,
    @SerialName("url")
    val url: String? = null
)

@Serializable
data class GameIndice(
    @SerialName("game_index")
    val gameIndex: Int? = null,
    @SerialName("version")
    val version: Attribute? = null
)

@Serializable
data class HeldItem(
    @SerialName("item")
    val item: Attribute? = null,
    @SerialName("version_details")
    val versionDetails: List<VersionDetail>? = listOf()
)

@Serializable
data class Move(
    @SerialName("move")
    val move: Attribute? = null,
    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>? = listOf()
)

@Serializable
data class Species(
    @SerialName("name")
    val name: String? = null,
    @SerialName("url")
    val url: String? = null
)

@Serializable
data class Sprites(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null,
    @SerialName("other")
    val other: Other? = null,
    @SerialName("versions")
    val versions: Versions? = null
)

@Serializable
data class Stat(
    @SerialName("base_stat")
    val baseStat: Int? = null,
    @SerialName("effort")
    val effort: Int? = null,
    @SerialName("stat")
    val stat: Attribute? = null
)

@Serializable
data class Type(
    @SerialName("slot")
    val slot: Int? = null,
    @SerialName("type")
    val type: Attribute? = null
)

@Serializable
data class VersionDetail(
    @SerialName("rarity")
    val rarity: Int? = null,
    @SerialName("version")
    val version: Attribute? = null
)

@Serializable
data class VersionGroupDetail(
    @SerialName("level_learned_at")
    val levelLearnedAt: Int? = null,
    @SerialName("move_learn_method")
    val moveLearnMethod: MoveLearnMethod? = null,
    @SerialName("version_group")
    val versionGroup: VersionGroup? = null
)

@Serializable
data class MoveLearnMethod(
    @SerialName("name")
    val name: String? = null,
    @SerialName("url")
    val url: String? = null
)

@Serializable
data class VersionGroup(
    @SerialName("name")
    val name: String? = null,
    @SerialName("url")
    val url: String? = null
)

@Serializable
data class Other(
    @SerialName("dream_world")
    val dreamWorld: DreamWorld? = null,
    @SerialName("home")
    val home: Home? = null,
    @SerialName("official-artwork")
    val officialArtwork: OfficialArtwork? = null
)

@Serializable
data class Versions(
    @SerialName("generation-i")
    val generationI: Generation.I? = null,
    @SerialName("generation-ii")
    val generationII: Generation.II? = null,
    @SerialName("generation-iii")
    val generationIII: Generation.III? = null,
    @SerialName("generation-iv")
    val generationIV: Generation.IV? = null,
    @SerialName("generation-v")
    val generationV: Generation.V? = null,
    @SerialName("generation-vi")
    val generationVI: Generation.VI? = null,
    @SerialName("generation-vii")
    val generationVII: Generation.VII? = null,
    @SerialName("generation-viii")
    val generationVIII: Generation.VIII? = null,
)

@Serializable
data class DreamWorld(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null
)

@Serializable
data class Home(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class OfficialArtwork(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null
)

@Serializable
data class RedBlue(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_gray")
    val backGray: String? = null,
    @SerialName("back_transparent")
    val backTransparent: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_gray")
    val frontGray: String? = null,
    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class Yellow(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_gray")
    val backGray: String? = null,
    @SerialName("back_transparent")
    val backTransparent: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_gray")
    val frontGray: String? = null,
    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class Crystal(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_transparent")
    val backShinyTransparent: String? = null,
    @SerialName("back_transparent")
    val backTransparent: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_transparent")
    val frontShinyTransparent: String? = null,
    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class Gold(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class Silver(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class Emerald(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null
)

@Serializable
data class FireRedLeafGreen(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null
)

@Serializable
data class RubySapphire(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null
)

@Serializable
data class DiamondPearl(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class HeartGoldSoulSilver(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class Platinum(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class BlackWhite(
    @SerialName("animated")
    val animated: Animated? = null,
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class Animated(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class OmegaRubyAlphaSapphire(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class XY(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class Icons(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null
)

@Serializable
data class UltraSunUltraMoon(
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class Attribute(
    @SerialName("name")
    val name: String? = null,
    @SerialName("url")
    val url: String? = null
)

@Serializable
sealed class Generation {
    @Serializable
    data class I(
        @SerialName("red-blue")
        val redBlue: RedBlue? = null,
        @SerialName("yellow")
        val yellow: Yellow? = null
    ) : Generation()

    @Serializable
    data class II(
        @SerialName("crystal")
        val crystal: Crystal? = null,
        @SerialName("gold")
        val gold: Gold? = null,
        @SerialName("silver")
        val silver: Silver? = null
    ) : Generation()

    @Serializable
    data class III(
        @SerialName("emerald")
        val emerald: Emerald? = null,
        @SerialName("firered-leafgreen")
        val fireRedLeafGreen: FireRedLeafGreen? = null,
        @SerialName("ruby-sapphire")
        val rubySapphire: RubySapphire? = null
    ) : Generation()

    @Serializable
    data class IV(
        @SerialName("diamond-pearl")
        val diamondPearl: DiamondPearl? = null,
        @SerialName("heartgold-soulsilver")
        val heartGoldSoulSilver: HeartGoldSoulSilver? = null,
        @SerialName("platinum")
        val platinum: Platinum? = null
    ) : Generation()

    @Serializable
    data class V(
        @SerialName("black-white")
        val blackWhite: BlackWhite? = null
    ) : Generation()

    @Serializable
    data class VI(
        @SerialName("omegaruby-alphasapphire")
        val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire? = null,
        @SerialName("x-y")
        val xY: XY? = null
    ) : Generation()

    @Serializable
    data class VII(
        @SerialName("icons")
        val icons: Icons? = null,
        @SerialName("ultra-sun-ultra-moon")
        val ultraSunUltraMoon: UltraSunUltraMoon? = null
    ) : Generation()

    @Serializable
    data class VIII(
        @SerialName("icons")
        val icons: Icons? = null
    ) : Generation()
}