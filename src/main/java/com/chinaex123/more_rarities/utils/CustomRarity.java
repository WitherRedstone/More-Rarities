package com.chinaex123.more_rarities.utils;

import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Rarity;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import java.util.function.UnaryOperator;

public class CustomRarity {

    // 破烂 - 深棕色
    public static final EnumProxy<Rarity> SCRAP = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:scrap", (UnaryOperator<Style>) style -> style.withColor(0x8B5A2B));

    // 垃圾 - 橄榄绿
    public static final EnumProxy<Rarity> TRASH = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:trash", (UnaryOperator<Style>) style -> style.withColor(0x556B2F));

    // 破损 - 石板灰
    public static final EnumProxy<Rarity> BROKEN = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:broken", (UnaryOperator<Style>) style -> style.withColor(0x708090));

    // 劣质 - 土褐色
    public static final EnumProxy<Rarity> POOR = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:poor", (UnaryOperator<Style>) style -> style.withColor(0xA0522D));

    // 普通 - 白色
    public static final EnumProxy<Rarity> COMMON = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:common", (UnaryOperator<Style>) style -> style.withColor(0xFFFFFF));

    // 优秀 - 亮青色
    public static final EnumProxy<Rarity> FINE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:fine", (UnaryOperator<Style>) style -> style.withColor(0x00E5FF));

    // 精良 - 翠绿色
    public static final EnumProxy<Rarity> SUPERIOR = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:superior", (UnaryOperator<Style>) style -> style.withColor(0x00C853));

    // 稀有 - 亮蓝色
    public static final EnumProxy<Rarity> RARE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:rare", (UnaryOperator<Style>) style -> style.withColor(0x2962FF));

    // 珍贵 - 樱花粉
    public static final EnumProxy<Rarity> PRECIOUS = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:precious", (UnaryOperator<Style>) style -> style.withColor(0xFF80AB));

    // 史诗 - 紫罗兰
    public static final EnumProxy<Rarity> EPIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:epic", (UnaryOperator<Style>) style -> style.withColor(0xD500F9));

    // 传奇 - 金色
    public static final EnumProxy<Rarity> LEGENDARY = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:legendary", (UnaryOperator<Style>) style -> style.withColor(0xFFAA00));

    // 远古 - 深青色
    public static final EnumProxy<Rarity> ANCIENT = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:ancient", (UnaryOperator<Style>) style -> style.withColor(0x00695C));

    // 神话 - 朱红色
    public static final EnumProxy<Rarity> MYTHIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:mythic", (UnaryOperator<Style>) style -> style.withColor(0xDD2C00));

    // 遗物 - 古铜色
    public static final EnumProxy<Rarity> RELIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:relic", (UnaryOperator<Style>) style -> style.withColor(0x8D6E63));

    // 诅咒 - 深紫色
    public static final EnumProxy<Rarity> CURSED = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:cursed", (UnaryOperator<Style>) style -> style.withColor(0x4A148C));

    // 神圣 - 琥珀橙
    public static final EnumProxy<Rarity> DIVINE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:divine", (UnaryOperator<Style>) style -> style.withColor(0xFFAB40));

    // 混沌 - 荧光绿
    public static final EnumProxy<Rarity> CHAOTIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:chaotic", (UnaryOperator<Style>) style -> style.withColor(0x76FF03));

    // 虚空 - 深蓝色
    public static final EnumProxy<Rarity> VOID = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:void", (UnaryOperator<Style>) style -> style.withColor(0x1A237E));

    // 不朽 - 薄荷绿
    public static final EnumProxy<Rarity> IMMORTAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:immortal", (UnaryOperator<Style>) style -> style.withColor(0x00BFA5));

    // 宇宙 - 亮紫色
    public static final EnumProxy<Rarity> COSMIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:cosmic", (UnaryOperator<Style>) style -> style.withColor(0x6200EA));

    // 永恒 - 亮绿色
    public static final EnumProxy<Rarity> ETERNAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:eternal", (UnaryOperator<Style>) style -> style.withColor(0x00E676));

    // 星辰 - 金黄色
    public static final EnumProxy<Rarity> STELLAR = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:stellar", (UnaryOperator<Style>) style -> style.withColor(0xFFC107));

    // 超越 - 洋红色
    public static final EnumProxy<Rarity> TRANSCENDENT = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:transcendent", (UnaryOperator<Style>) style -> style.withColor(0xF50057));

    // 梦境 - 淡紫色
    public static final EnumProxy<Rarity> DREAM = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:dream", (UnaryOperator<Style>) style -> style.withColor(0xE040FB));

    // 起源 - 草绿色
    public static final EnumProxy<Rarity> PRIMEVAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:primeval", (UnaryOperator<Style>) style -> style.withColor(0x33691E));

    // 无限 - 橙色
    public static final EnumProxy<Rarity> INFINITE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:infinite", (UnaryOperator<Style>) style -> style.withColor(0xFF6D00));

    // 觉醒 - 黄绿色
    public static final EnumProxy<Rarity> AWAKENED = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:awakened", (UnaryOperator<Style>) style -> style.withColor(0x64DD17));

    // 终焉 - 暗红色
    public static final EnumProxy<Rarity> FINAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:final", (UnaryOperator<Style>) style -> style.withColor(0xB71C1C));

    // 神权 - 深紫色
    public static final EnumProxy<Rarity> THEOCRATIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:theocratic", (UnaryOperator<Style>) style -> style.withColor(0x7B1FA2));

    // 绝对 - 青色
    public static final EnumProxy<Rarity> ABSOLUTE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:absolute", (UnaryOperator<Style>) style -> style.withColor(0x18FFFF));

    // 幻光 - 亮粉色
    public static final EnumProxy<Rarity> AURORA = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:aurora", (UnaryOperator<Style>) style -> style.withColor(0xFF4081));

    // 星尘 - 浅紫色
    public static final EnumProxy<Rarity> STARDUST = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:stardust", (UnaryOperator<Style>) style -> style.withColor(0xB388FF));

    // 深邃 - 深蓝色
    public static final EnumProxy<Rarity> ABYSSAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:abyssal", (UnaryOperator<Style>) style -> style.withColor(0x0D47A1));

    // 辉煌 - 亮橙色
    public static final EnumProxy<Rarity> RESPLENDENT = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:resplendent", (UnaryOperator<Style>) style -> style.withColor(0xFF9100));

    // 奥秘 - 亮紫色
    public static final EnumProxy<Rarity> ARCANE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:arcane", (UnaryOperator<Style>) style -> style.withColor(0xAA00FF));

    // 龙魂 - 深橙色
    public static final EnumProxy<Rarity> DRACONIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:draconic", (UnaryOperator<Style>) style -> style.withColor(0xBF360C));

    // 天界 - 柠檬黄
    public static final EnumProxy<Rarity> CELESTIAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:celestial", (UnaryOperator<Style>) style -> style.withColor(0xFFEA00));

    // 深渊 - 深蓝色
    public static final EnumProxy<Rarity> ABYSS = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:abyss", (UnaryOperator<Style>) style -> style.withColor(0x01579B));

    // 涅槃 - 湖蓝色
    public static final EnumProxy<Rarity> NIRVANA = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:nirvana", (UnaryOperator<Style>) style -> style.withColor(0x00ACC1));

    // 至尊 - 琥珀金
    public static final EnumProxy<Rarity> ULTIMATE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:ultimate", (UnaryOperator<Style>) style -> style.withColor(0xFFB300));

    // 虚无 - 深灰色
    public static final EnumProxy<Rarity> NIHIL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:nihil", (UnaryOperator<Style>) style -> style.withColor(0x263238));

    // 创世 - 浅绿色
    public static final EnumProxy<Rarity> PRIMORDIAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:primordial", (UnaryOperator<Style>) style -> style.withColor(0x69F0AE));

    // 神罚 - 银灰色
    public static final EnumProxy<Rarity> JUDGEMENT = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:judgement", (UnaryOperator<Style>) style -> style.withColor(0xCFD8DC));

    // 永恒之火 - 火焰橙
    public static final EnumProxy<Rarity> ETERNAL_FLAME = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:eternal_flame", (UnaryOperator<Style>) style -> style.withColor(0xFF3D00));

    // 极寒 - 冰蓝色
    public static final EnumProxy<Rarity> FRIGID = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:frigid", (UnaryOperator<Style>) style -> style.withColor(0x80D8FF));

    // 雷鸣 - 闪电黄
    public static final EnumProxy<Rarity> THUNDEROUS = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:thunderous", (UnaryOperator<Style>) style -> style.withColor(0xFDD835));

    // 地心 - 熔岩橙
    public static final EnumProxy<Rarity> TELLURIAN = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:tellurian", (UnaryOperator<Style>) style -> style.withColor(0xD84315));

    // 翡翠 - 翡翠绿
    public static final EnumProxy<Rarity> JADE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:jade", (UnaryOperator<Style>) style -> style.withColor(0x2E7D32));

    // 绯红 - 绯红色
    public static final EnumProxy<Rarity> CRIMSON = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:crimson", (UnaryOperator<Style>) style -> style.withColor(0xC62828));

    // 琉璃 - 琉璃蓝
    public static final EnumProxy<Rarity> AZURE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:azure", (UnaryOperator<Style>) style -> style.withColor(0x0288D1));

    // 黄昏 - 暮光紫
    public static final EnumProxy<Rarity> TWILIGHT = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:twilight", (UnaryOperator<Style>) style -> style.withColor(0x6A1B9A));

    // 曙光 - 晨曦橙
    public static final EnumProxy<Rarity> DAWN = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:dawn", (UnaryOperator<Style>) style -> style.withColor(0xFFB74D));

    // 月华 - 月光蓝
    public static final EnumProxy<Rarity> LUNAR = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:lunar", (UnaryOperator<Style>) style -> style.withColor(0x4FC3F7));

    // 日曜 - 日光红
    public static final EnumProxy<Rarity> SOLAR = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:solar", (UnaryOperator<Style>) style -> style.withColor(0xFF5252));

    // 星辉 - 星光黄
    public static final EnumProxy<Rarity> STARLIGHT = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:starlight", (UnaryOperator<Style>) style -> style.withColor(0xFFF176));

    // 梦境编织者 - 梦幻粉
    public static final EnumProxy<Rarity> DREAMWEAVER = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:dreamweaver", (UnaryOperator<Style>) style -> style.withColor(0xF48FB1));

    // 时空 - 时空蓝
    public static final EnumProxy<Rarity> CHRONAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:chronal", (UnaryOperator<Style>) style -> style.withColor(0x29B6F6));

    // 量子 - 量子紫
    public static final EnumProxy<Rarity> QUANTUM = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:quantum", (UnaryOperator<Style>) style -> style.withColor(0xCE93D8));

    // 奇点 - 灰蓝色
    public static final EnumProxy<Rarity> SINGULARITY = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:singularity", (UnaryOperator<Style>) style -> style.withColor(0x78909C));

    // 多维 - 品红色
    public static final EnumProxy<Rarity> MULTIVERSAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:multiversal", (UnaryOperator<Style>) style -> style.withColor(0xE91E63));

    // 花海 - 樱花粉
    public static final EnumProxy<Rarity> FLORAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:floral", (UnaryOperator<Style>) style -> style.withColor(0xF06292));

    // 极光 - 极光绿
    public static final EnumProxy<Rarity> AURORAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:auroral", (UnaryOperator<Style>) style -> style.withColor(0xAED581));

    // 暮色 - 暮色橙
    public static final EnumProxy<Rarity> DUSK = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:dusk", (UnaryOperator<Style>) style -> style.withColor(0xFF8A65));

    // 晨曦 - 晨曦黄绿
    public static final EnumProxy<Rarity> MORNING = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:morning", (UnaryOperator<Style>) style -> style.withColor(0xC0CA33));

    // 精灵 - 精灵蓝
    public static final EnumProxy<Rarity> FAERIE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:faerie", (UnaryOperator<Style>) style -> style.withColor(0x81D4FA));

    // 恶魔 - 恶魔红
    public static final EnumProxy<Rarity> DEMONIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:demonic", (UnaryOperator<Style>) style -> style.withColor(0xEF5350));

    // 天使 - 天使蓝
    public static final EnumProxy<Rarity> ANGELIC = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:angelic", (UnaryOperator<Style>) style -> style.withColor(0xB3E5FC));

    // 龙皇 - 龙皇金
    public static final EnumProxy<Rarity> DRAGONLORD = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:dragonlord", (UnaryOperator<Style>) style -> style.withColor(0xFFCA28));

    // 凤皇 - 凤皇橙
    public static final EnumProxy<Rarity> PHOENIX = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:phoenix", (UnaryOperator<Style>) style -> style.withColor(0xFF7043));

    // 神皇 - 神皇金
    public static final EnumProxy<Rarity> GODKING = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:godking", (UnaryOperator<Style>) style -> style.withColor(0xFFD54F));

    // 时间 - 时间青
    public static final EnumProxy<Rarity> TEMPORAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:temporal", (UnaryOperator<Style>) style -> style.withColor(0x26A69A));

    // 空间 - 空间蓝
    public static final EnumProxy<Rarity> SPATIAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:spatial", (UnaryOperator<Style>) style -> style.withColor(0x42A5F5));

    // 命运 - 命运紫
    public static final EnumProxy<Rarity> DESTINY = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:destiny", (UnaryOperator<Style>) style -> style.withColor(0xAB47BC));

    // 因果 - 因果青
    public static final EnumProxy<Rarity> KARMA = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:karma", (UnaryOperator<Style>) style -> style.withColor(0x4DB6AC));

    // 轮回 - 轮回粉
    public static final EnumProxy<Rarity> SAMSARA = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:samsara", (UnaryOperator<Style>) style -> style.withColor(0xEC407A));

    // 虚无之主 - 暗灰色
    public static final EnumProxy<Rarity> LORD_VOID = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:lord_void", (UnaryOperator<Style>) style -> style.withColor(0x37474F));

    // 混沌之主 - 混沌金
    public static final EnumProxy<Rarity> LORD_CHAOS = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:lord_chaos", (UnaryOperator<Style>) style -> style.withColor(0xFFB300));

    // 秩序之主 - 秩序蓝
    public static final EnumProxy<Rarity> LORD_ORDER = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:lord_order", (UnaryOperator<Style>) style -> style.withColor(0x039BE5));

    // 永恒之主 - 永恒绿
    public static final EnumProxy<Rarity> LORD_ETERNAL = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:lord_eternal", (UnaryOperator<Style>) style -> style.withColor(0x43A047));

    // 创造 - 品红偏紫
    public static final EnumProxy<Rarity> CREATIVE = new EnumProxy<>(
            Rarity.class, -1, "more_rarities:creative", (UnaryOperator<Style>) style -> style.withColor(0xFF00BB));
}