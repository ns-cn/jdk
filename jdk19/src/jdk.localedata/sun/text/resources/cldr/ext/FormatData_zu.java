/*
 * Copyright (c) 2012, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_zu extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "ISonto",
            "UMsombuluko",
            "ULwesibili",
            "ULwesithathu",
            "ULwesine",
            "ULwesihlanu",
            "UMgqibelo",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "Son",
            "Mso",
            "Bil",
            "Tha",
            "Sin",
            "Hla",
            "Mgq",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "S",
            "M",
            "B",
            "T",
            "S",
            "H",
            "M",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "ikota yesi-1",
            "ikota yesi-2",
            "ikota yesi-3",
            "ikota yesi-4",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "Q1",
            "Q2",
            "Q3",
            "Q4",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "",
            "",
            "entathakusa",
            "ekuseni",
            "emini",
            "",
            "ntambama",
            "",
            "ebusuku",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a",
            "p",
            "",
            "",
            "entathakusa",
            "ekuseni",
            "emini",
            "",
            "ntambama",
            "",
            "ebusuku",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE dd MMMM y G",
            "d MMMM y G",
            "d MMM y G",
            "GGGGG y-MM-dd",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE dd MMMM y GGGG",
            "d MMMM y GGGG",
            "d MMM y GGGG",
            "G y-MM-dd",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_hmv = "h:mm a v";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss a v";
        final String metaValue_generic_DateFormatItem_yw = "'week' w 'of' Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, MMM d";
        final String metaValue_generic_DateFormatItem_Hmsv = "HH:mm:ss v";
        final String metaValue_generic_DateFormatItem_GyMd = "M/d/y GGGGG";
        final String metaValue_generic_DateFormatItem_MMMMW = "'week' W 'of' MMMM";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, MMM d, y";
        final String metaValue_generic_DateFormatItem_yMEd = "y-MM-dd, E";
        final String metaValue_generic_DateFormatItem_yMMMd = "MMM d, y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_Hmv = "HH:mm v";
        final String metaValue_generic_DateFormatItem_yMd = "y-MM-dd";
        final String metaValue_generic_DateFormatItem_yM = "y-MM";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthNames = new String[] {
            "Januwari",
            "Februwari",
            "Mashi",
            "Ephreli",
            "Meyi",
            "Juni",
            "Julayi",
            "Agasti",
            "Septhemba",
            "Okthoba",
            "Novemba",
            "Disemba",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "Jan",
            "Feb",
            "Mas",
            "Eph",
            "Mey",
            "Jun",
            "Jul",
            "Aga",
            "Sep",
            "Okt",
            "Nov",
            "Dis",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "J",
            "F",
            "M",
            "E",
            "M",
            "J",
            "J",
            "A",
            "S",
            "O",
            "N",
            "D",
            "",
        };
        final String[] metaValue_long_Eras = new String[] {
            "BC",
            "AD",
        };
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_Ehm = "E h:mm a";
        final String metaValue_buddhist_DateFormatItem_hms = "h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Gy = "G y";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_buddhist_DateFormatItem_EBhm = "E h:mm B";
        final String metaValue_buddhist_DateFormatItem_E = "ccc";
        final String metaValue_buddhist_DateFormatItem_MMMMd = "MMMM d";
        final String metaValue_buddhist_DateFormatItem_H = "HH";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_Bh = "h B";
        final String metaValue_buddhist_DateFormatItem_h = "h a";
        final String metaValue_buddhist_DateFormatItem_MMMd = "MMM d";
        final String metaValue_buddhist_DateFormatItem_GyMMM = "G y MMM";
        final String metaValue_buddhist_DateFormatItem_Ehms = "E h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Bhms = "h:mm:ss B";
        final String metaValue_buddhist_DateFormatItem_GyMMMd = "G y MMM d";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_Md = "MM-dd";
        final String metaValue_buddhist_DateFormatItem_EBhms = "E h:mm:ss B";
        final String metaValue_buddhist_DateFormatItem_Bhm = "h:mm B";
        final String metaValue_buddhist_DateFormatItem_MEd = "MM-dd, E";
        final String metaValue_buddhist_DateFormatItem_GyMMMEd = "G y MMM d, E";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String metaValue_calendarname_gregorian = "ikhalenda lesi-Gregorian";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "calendarname.islamic-civil", "i-Islamic-Civil Calendar" },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.MEd", metaValue_buddhist_DateFormatItem_MEd },
            { "field.minute", "Iminithi" },
            { "japanese.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "field.second", "Isekhondi" },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DayPeriodRules", "night1:19:00-24:00;morning2:06:00-10:00;afternoon1:10:00-13:00;morning1:00:00-06:00;evening1:13:00-19:00" },
            { "islamic-civil.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "japanese.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.Md", metaValue_buddhist_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "japanese.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMEd", "E, M/d/y GGGGG" },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "timezone.regionFormat.daylight", "{0} Isikhathi sasemini" },
            { "DatePatterns",
                new String[] {
                    "EEEE, MMMM d, y",
                    "MMMM d, y",
                    "MMM d, y",
                    "M/d/yy",
                }
            },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "timezone.regionFormat.standard", "{0} isikhathi esivamile" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "calendarname.japanese", "Ikhalenda lesi-Japanese" },
            { "japanese.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_buddhist_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "long.Eras", metaValue_long_Eras },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "field.era", "Isikhathi" },
            { "field.dayperiod", "AM/PM" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "Inyanga" },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "islamic.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.MEd", metaValue_buddhist_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "generic.DateFormatItem.yyyy", "y G" },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras", metaValue_long_Eras },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_buddhist_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "field.weekday", "Usuku evikini" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "japanese.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_buddhist_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.MEd", metaValue_buddhist_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yyyyMMMEd", "E, MMM d, y G" },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0K other:0K}",
                    "{one:00K other:00K}",
                    "{one:000K other:000K}",
                    "{one:0M other:0M}",
                    "{one:00M other:00M}",
                    "{one:000M other:000M}",
                    "{one:0B other:0B}",
                    "{one:00B other:00B}",
                    "{one:000B other:000B}",
                    "{one:0T other:0T}",
                    "{one:00T other:00T}",
                    "{one:000T other:000T}",
                }
            },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.hour", "Ihora" },
            { "calendarname.buddhist", "ikhalenda lesi-Buddhist" },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "calendarname.islamic-umalqura", "Ikhalenda yesi-Islamic (Umm al-Qura)" },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_buddhist_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "standalone.MonthNarrows",
                new String[] {
                    "J",
                    "F",
                    "M",
                    "A",
                    "M",
                    "J",
                    "J",
                    "A",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_buddhist_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "calendarname.islamic", "Ikhalenda lesi-Islamic" },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.MEd", metaValue_buddhist_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "Isikhathi sase-{0}" },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "japanese.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_buddhist_DateFormatItem_MEd },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "field.year", "Unyaka" },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_buddhist_DateFormatItem_GyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.Md", metaValue_buddhist_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "roc.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_buddhist_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "calendarname.roc", "Ikhalenda lesi-Minguo" },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "generic.DateFormatItem.yyyyM", "M/y GGGGG" },
            { "islamic.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "generic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "japanese.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'inkulungwane other:0' 'inkulungwane}",
                    "{one:00' 'inkulungwane other:00' 'inkulungwane}",
                    "{one:000' 'inkulungwane other:000' 'inkulungwane}",
                    "{one:0' 'isigidi other:0' 'isigidi}",
                    "{one:00' 'isigidi other:00' 'isigidi}",
                    "{one:000' 'isigidi other:000' 'isigidi}",
                    "{one:0' 'isigidi' 'sezigidi other:0' 'isigidi' 'sezigidi}",
                    "{one:00' 'isigidi' 'sezigidi other:00' 'isigidi' 'sezigidi}",
                    "{one:000' 'isigidi' 'sezigidi other:000' 'isigidi' 'sezigidi}",
                    "{one:0' 'isigidintathu other:0' 'isigidintathu}",
                    "{one:00' 'isigidintathu other:00' 'isigidintathu}",
                    "{one:000' 'isigidintathu other:000' 'isigidintathu}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "field.zone", "Isikhathi sendawo" },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.DateFormatItem.Gy", metaValue_buddhist_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "generic.DateFormatItem.yyyyMMMd", "MMM d, y G" },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMMM", "MMM y G" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_buddhist_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.MEd", metaValue_buddhist_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.week", "Iviki" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.Md", metaValue_buddhist_DateFormatItem_Md },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "PluralRules", "one:i = 0 or n = 1" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}