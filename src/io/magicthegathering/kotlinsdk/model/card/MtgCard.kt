package io.magicthegathering.kotlinsdk.model.card

data class MtgCard(val id: String?,
              val name: String,
              val names: List<String>?,
              val manaCost: String,
              val cmc: Int?,
              val colors: List<String>?,
              val colorIdentity: List<String>?,
              val type: String,
              val supertypes: List<String>?,
              val types: List<String>,
              val subtypes: List<String>?,
              val rarity: String,
              val set: String,
              val setName: String,
              val text: String?,
              val artist: String,
              val number: String?,
              val power: String?,
              val toughness: String?,
              val loyalty: Int?,
              val multiverseid: Int?,
              val imageUrl: String?,
              val layout: String,
              val legalities: List<MtgCardLegality>?,
              val rulings: List<MtgCardRuling>?,
              val foreignNames: List<MtgCardForeignName>?)
