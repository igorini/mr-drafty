package com.igorini.mrdrafty

import com.igorini.mrdrafty.card.*

fun main(args: Array<String>) {
    val allCards = listOf(Abaddon(), AghanimsSanctum(), AltarOfTheMadMoon(), AndOneForMe(), Annihilation(), ApotheosisBlade(), ArcaneAssault(), ArcaneCensure(), ArmTheRebellion(), AssassinsApprentice(), AssassinsShadow(), AssassinsVeil(), AssuredDestruction(), AtAnyCost(), AvernusBlessing(), Axe(), BarbedMail(), Beastmaster(), Bellow(), BetterLateThanNever(), BitterEnemies(), BladeOfTheVigil(), BlinkDagger(), Bloodseeker(), BoltOfDamocles(), BookOfTheDead(), BountyHunter(), BracersOfSacrifice(), Bristleback(), Broadsword(), BronzeLegionnaire(), BurningOil(), BuyingTime(), CallTheReserves(), CaughtUnprepared(), CentaurWarruner(), Chainmail(), ChampionOfTheAncient(), CheatingDeath(), Chen(), ClaszuremeHourglass(), Claymore(), CleansingRite(), ClearTheDeck(), CloakOfEndlessCarnage(), CollateralDamage(), CombatTraining(), Compel(), Conflagration(), CoordinatedAssault(), CorrosiveMist(), CripplingBlow(), CrystalMaiden(), CunningPlan(), CursedSatyr(), CurseOfAtrophy(), DarkSeer(), DebbiTheCunning(), DefendTheWeak(), DefensiveBloom(), DefensiveStance(), DemagickingMaul(), DiabolicRevelation(), DimensionalPortal(), DirtyDeeds(), DiscipleOfNevermore(), DivineIntervention(), DivinePurpose(), DrowRanger(), Earthshaker(), EmissaryOfTheQuorum(), Enchantress(), EnoughMagic(), EscapeRoute(), FarvhanTheDreamer(), FightThroughThePain(), FogOfWar(), Foresight(), ForwardCharge(), FracturedTimeline(), FriendlyFire(), FurLinedMantle(), Gank(), GlyphOfConfusion(), GoldenTicket(), GrandMelee(), GrazingShot(), HellbearCrippler(), HelmOfTheDominator(), HeroicResolve(), HerosCape(), HipFire(), HomefieldAdvantage(), HornOfTheAlpha(), HowlingMind(), IncarnationOfSelemene(), Intimidation(), IronBranchProtection(), IronFogGoldmine(), JasperDaggers(), JmuyTheWise(), Juke(), Kanna(), KeefeTheBold(), KeenfolkGolem(), KeenfolkMusket(), KeenfolkPlate(), KeenfolkTurret(), LeatherArmor(), LegionCommander(), LegionStandardBearer(), Lich(), LightningStrike(), Lion(), LodestoneDemolition(), LostInTime(), Luna(), Lycan(), Magnus(), MarrowfellBrawler(), Mazzie(), Meepo(), MercenaryExiles(), MessengerRookery(), MistOfAvernus(), MurderPlot(), Necrophos(), NewOrders(), NyctashasGuard(), ObliteratingOrb(), OglodiCatapult(), OglodiVandal(), OgreConscript(), OgreCorpseTosser(), OgreMagi(), Omniknight(), OutworldDevourer(), PathOfTheBold(), PathOfTheCunning(), PathOfTheDreamer(), PathOfTheWise(), Payday(), PhantomAssassin(), PhaseBoots(), PickAFight(), PickOff(), PitFighterOfQuoidge(), Platemail(), PoachingKnife(), PoisedToStrike(), Prellex(), Pugna(), RampagingHellbear(), Ravenhook(), RavenousMass(), Raze(), RebelDecoy(), RebelInstigator(), RedMistMaul(), RedMistPillager(), RelentlessPursuit(), RelentlessZombie(), RemoteDetonation(), RendArmor(), RestorationEffort(), RevtelConvoy(), RevtelInvestments(), RevtelSignetRing(), RingOfTarrasque(), RisingAnger(), RistulEmblem(), Rix(), RollingStorm(), RoseleafRejuvenator(), Routed(), RumusqueBlessing(), RumusqueVestments(), SatyrDuelist(), SatyrMagician(), SelemenesFavor(), SelfishCleric(), SelfSabotage(), SeraphimShield(), ShieldOfAquila(), ShieldOfBasilius(), ShivasGuard(), ShopDeed(), ShortSword(), SisterOfTheVeil(), SkywrathMage(), Slay(), SmashTheirDefenses(), SmeevilArmsmaster(), SmeevilBlacksmith(), Sniper(), SorlaKhan(), SoulOfSpring(), SpotWeakness(), SpringTheTrap(), StarsAlign(), StealStrength(), SteamCannon(), StonehallCloak(), StonehallElite(), StonehallPike(), StonehallPlate(), StormSpirit(), StrafingRun(), SuckerPunch(), Sven(), TempleOfWar(), TheCoverOfNight(), TheOath(), TheOmexeArena(), TheTylerEstate(), ThunderhideAlpha(), ThunderhidePack(), Thunderstorm(), Tidehunter(), Timbersaw(), TimeOfTriumph(), Tinker(), TowerBarrage(), TravelersCloak(), TreantProtector(), Trebuchets(), TresdinsStandards(), TrollSoothsayer(), TylerEstateCensor(), UnearthedSecrets(), UnsupervisedArtillery(), UntestedGrunt(), Ursa(), Venomancer(), Ventriloquy(), VestureOfTheTyrant(), VhoulMartyr(), Viper(), Watchtower(), WhispersOfMadness(), WingfallHammer(), WinterWyvern(), WrathOfGold(), Zeus())



/*    println("All cards: ${allCards.count()}")

    println("---")
    printColorRarity(allCards, "Red", CardColor.RED)
    printColorRarity(allCards, "Black", CardColor.BLACK)
    printColorRarity(allCards, "Green", CardColor.GREEN)
    printColorRarity(allCards, "Blue", CardColor.BLUE)
    printColorRarity(allCards, "Items", CardColor.NONE)

    println("---")
    printColorTypes(allCards, "Red", CardColor.RED)
    printColorTypes(allCards, "Black", CardColor.BLACK)
    printColorTypes(allCards, "Green", CardColor.GREEN)
    printColorTypes(allCards, "Blue", CardColor.BLUE)*/
}

fun printColorRarity(allCards: List<Card>, color: String, cardColor: CardColor) {
    val colorCards = allCards.filter { it.color() == cardColor }
    val colorBasic = colorCards.filter { it.rarity() == CardRarity.BASIC }
    val colorCommon = colorCards.filter { it.rarity() == CardRarity.COMMON }
    val colorUncommon = colorCards.filter { it.rarity() == CardRarity.UNCOMMON }
    val colorRare = colorCards.filter { it.rarity() == CardRarity.RARE }
    println("$color cards: ${colorCards.count()}. Basic: ${colorBasic.count()}, Common: ${colorCommon.count()}, Uncommon: ${colorUncommon.count()}, Rare: ${colorRare.count()}")
/*    println("$color common cards: $colorCommon")
    println("$color uncommon cards: $colorUncommon")
    println("$color rare cards: $colorRare")*/
}

fun printColorTypes(allCards: List<Card>, color: String, cardColor: CardColor) {
    val colorCards = allCards.filter { it.color() == cardColor }
    val colorHeroes = colorCards.filter { it.type() == CardType.HERO }
    val colorImprovements = colorCards.filter { it.type() == CardType.IMPROVEMENT }
    val colorSpells = colorCards.filter { it.type() == CardType.SPELL }
    val colorCreeps = colorCards.filter { it.type() == CardType.CREEP }
    println("$color cards: ${colorCards.count()}. Heroes: ${colorHeroes.count()}, Improvements: ${colorImprovements.count()}, Spells: ${colorSpells.count()}, Creeps: ${colorCreeps.count()}")
    //println("$color heroes: $colorHeroes")
}