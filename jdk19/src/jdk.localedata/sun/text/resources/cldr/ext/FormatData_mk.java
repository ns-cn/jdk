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

public class FormatData_mk extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u043d\u0435\u0434\u0435\u043b\u0430",
            "\u043f\u043e\u043d\u0435\u0434\u0435\u043b\u043d\u0438\u043a",
            "\u0432\u0442\u043e\u0440\u043d\u0438\u043a",
            "\u0441\u0440\u0435\u0434\u0430",
            "\u0447\u0435\u0442\u0432\u0440\u0442\u043e\u043a",
            "\u043f\u0435\u0442\u043e\u043a",
            "\u0441\u0430\u0431\u043e\u0442\u0430",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u043d\u0435\u0434.",
            "\u043f\u043e\u043d.",
            "\u0432\u0442\u043e.",
            "\u0441\u0440\u0435.",
            "\u0447\u0435\u0442.",
            "\u043f\u0435\u0442.",
            "\u0441\u0430\u0431.",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u043d",
            "\u043f",
            "\u0432",
            "\u0441",
            "\u0447",
            "\u043f",
            "\u0441",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u043f\u0440\u0432\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
            "\u0432\u0442\u043e\u0440\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
            "\u0442\u0440\u0435\u0442\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
            "\u0447\u0435\u0442\u0432\u0440\u0442\u043e \u0442\u0440\u043e\u043c\u0435\u0441\u0435\u0447\u0458\u0435",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "\u0458\u0430\u043d-\u043c\u0430\u0440",
            "\u0430\u043f\u0440-\u0458\u0443\u043d",
            "\u0458\u0443\u043b-\u0441\u0435\u043f",
            "\u043e\u043a\u0442-\u0434\u0435\u043a",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u043f\u0440\u0435\u0442\u043f\u043b\u0430\u0434\u043d\u0435",
            "\u043f\u043e\u043f\u043b\u0430\u0434\u043d\u0435",
            "\u043f\u043e\u043b\u043d\u043e\u045c",
            "\u043d\u0430\u043f\u043b\u0430\u0434\u043d\u0435",
            "\u043d\u0430\u0443\u0442\u0440\u043e",
            "\u043f\u0440\u0435\u0442\u043f\u043b\u0430\u0434\u043d\u0435",
            "\u043f\u043e\u043f\u043b\u0430\u0434\u043d\u0435",
            "",
            "\u043d\u0430\u0432\u0435\u0447\u0435\u0440",
            "",
            "\u043f\u043e \u043f\u043e\u043b\u043d\u043e\u045c",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u043f\u0440\u0435\u0442\u043f\u043b.",
            "\u043f\u043e\u043f\u043b.",
            "\u043f\u043e\u043b\u043d.",
            "\u043d\u0430\u043f\u043b.",
            "\u0443\u0442\u0440\u043e",
            "\u043f\u0440\u0435\u0442\u043f\u043b.",
            "\u043f\u043e\u043f\u043b.",
            "",
            "\u0432\u0435\u0447.",
            "",
            "\u043d\u043e\u045c\u0435",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u043f\u0440\u0435\u0442\u043f\u043b.",
            "\u043f\u043e\u043f\u043b.",
            "\u043f\u043e\u043b\u043d\u043e\u045c",
            "\u043d\u0430\u043f\u043b\u0430\u0434\u043d\u0435",
            "\u043d\u0430\u0443\u0442\u0440\u043e",
            "\u043f\u0440\u0435\u0442\u043f\u043b\u0430\u0434\u043d\u0435",
            "\u043f\u043e\u043f\u043b\u0430\u0434\u043d\u0435",
            "",
            "\u043d\u0430\u0432\u0435\u0447\u0435\u0440",
            "",
            "\u043d\u043e\u045c\u0435",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, dd MMMM y '\u0433'. G",
            "dd MMMM y '\u0433'. G",
            "dd.M.y G",
            "dd.M.y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, dd MMMM y '\u0433'. GGGG",
            "dd MMMM y '\u0433'. GGGG",
            "dd.M.y GGGG",
            "dd.M.y G",
        };
        final String metaValue_generic_DateFormatItem_yyyyMMMM = "MMMM y '\u0433'. G";
        final String metaValue_generic_DateFormatItem_yyyyQQQQ = "QQQ y G";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "dd MMM y '\u0433'. G";
        final String metaValue_generic_DateFormatItem_hmv = "h:mm a v";
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss a v";
        final String metaValue_generic_DateFormatItem_yw = "w. '\u0441\u0435\u0434\u043c\u0438\u0446\u0430' '\u043e\u0434' Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y '\u0433'.";
        final String metaValue_generic_DateFormatItem_MMMMEd = "E, d MMMM";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y '\u0433'. G";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, d MMM";
        final String metaValue_generic_DateFormatItem_Hmsv = "HH:mm:ss v";
        final String metaValue_generic_DateFormatItem_GyMd = "d.M.y GGGGG";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "W. '\u0441\u0435\u0434\u043c\u0438\u0446\u0430' '\u043e\u0434' MMMM";
        final String metaValue_generic_DateFormatItem_yyyy = "y '\u0433'. G";
        final String metaValue_generic_DateFormatItem_y = "y";
        final String metaValue_generic_DateFormatItem_GyMMM = "MMM y G";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM y '\u0433'.";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d.M.y";
        final String metaValue_generic_DateFormatItem_Mdd = "d.M";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E, dd MMM y '\u0433'. G";
        final String metaValue_generic_DateFormatItem_GyMMMd = "d MMM y G";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y '\u0433'.";
        final String metaValue_generic_DateFormatItem_yyyyMEd = "E, dd.M.y G";
        final String metaValue_generic_DateFormatItem_yyyyMd = "dd.M.y G";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y '\u0433'.";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_MEd = "E, d.M";
        final String metaValue_generic_DateFormatItem_GyMMMEd = "E, d MMM y G";
        final String metaValue_generic_DateFormatItem_yyyyM = "M.y G";
        final String metaValue_generic_DateFormatItem_Hmv = "HH:mm v";
        final String metaValue_generic_DateFormatItem_yMd = "d.M.y";
        final String metaValue_generic_DateFormatItem_yM = "M.y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y '\u0433'.";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y '\u0433'.";
        final String[] metaValue_MonthNames = new String[] {
            "\u0458\u0430\u043d\u0443\u0430\u0440\u0438",
            "\u0444\u0435\u0432\u0440\u0443\u0430\u0440\u0438",
            "\u043c\u0430\u0440\u0442",
            "\u0430\u043f\u0440\u0438\u043b",
            "\u043c\u0430\u0458",
            "\u0458\u0443\u043d\u0438",
            "\u0458\u0443\u043b\u0438",
            "\u0430\u0432\u0433\u0443\u0441\u0442",
            "\u0441\u0435\u043f\u0442\u0435\u043c\u0432\u0440\u0438",
            "\u043e\u043a\u0442\u043e\u043c\u0432\u0440\u0438",
            "\u043d\u043e\u0435\u043c\u0432\u0440\u0438",
            "\u0434\u0435\u043a\u0435\u043c\u0432\u0440\u0438",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u0458\u0430\u043d.",
            "\u0444\u0435\u0432.",
            "\u043c\u0430\u0440.",
            "\u0430\u043f\u0440.",
            "\u043c\u0430\u0458",
            "\u0458\u0443\u043d.",
            "\u0458\u0443\u043b.",
            "\u0430\u0432\u0433.",
            "\u0441\u0435\u043f\u0442.",
            "\u043e\u043a\u0442.",
            "\u043d\u043e\u0435\u043c.",
            "\u0434\u0435\u043a.",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u0458",
            "\u0444",
            "\u043c",
            "\u0430",
            "\u043c",
            "\u0458",
            "\u0458",
            "\u0430",
            "\u0441",
            "\u043e",
            "\u043d",
            "\u0434",
            "",
        };
        final String metaValue_buddhist_DateFormatItem_hm = "h:mm a";
        final String metaValue_buddhist_DateFormatItem_Ehm = "E h:mm a";
        final String metaValue_buddhist_DateFormatItem_hms = "h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Hm = "HH:mm";
        final String metaValue_buddhist_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_buddhist_DateFormatItem_EBhm = "E h:mm B";
        final String metaValue_buddhist_DateFormatItem_E = "ccc";
        final String metaValue_buddhist_DateFormatItem_H = "HH";
        final String metaValue_buddhist_DateFormatItem_M = "L";
        final String metaValue_buddhist_DateFormatItem_d = "d";
        final String metaValue_buddhist_DateFormatItem_Bh = "h B";
        final String metaValue_buddhist_DateFormatItem_h = "h a";
        final String metaValue_buddhist_DateFormatItem_Ehms = "E h:mm:ss a";
        final String metaValue_buddhist_DateFormatItem_Bhms = "h:mm:ss B";
        final String metaValue_buddhist_DateFormatItem_ms = "mm:ss";
        final String metaValue_buddhist_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_buddhist_DateFormatItem_MMM = "LLL";
        final String metaValue_buddhist_DateFormatItem_EBhms = "E h:mm:ss B";
        final String metaValue_buddhist_DateFormatItem_Bhm = "h:mm B";
        final String metaValue_buddhist_DateFormatItem_Hms = "HH:mm:ss";
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u043f\u0440\u0435\u0434 \u0420.\u041a.",
            "\u043c\u0438\u043d\u0433\u0443\u043e",
        };
        final String[] metaValue_java_time_roc_Eras = new String[] {
            "\u043f\u0440. \u0420.\u041a.",
            "\u043c\u0438\u043d\u0433\u0443\u043e",
        };
        final String metaValue_calendarname_gregorian = "\u0413\u0440\u0435\u0433\u043e\u0440\u0438\u0458\u0430\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "roc.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "islamic.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "buddhist.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_yyyy },
            { "calendarname.islamic-civil", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438 \u0433\u0440\u0430\u0453\u0430\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "islamic.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "islamic.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "field.minute", "\u043c\u0438\u043d\u0443\u0442\u0430" },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.MonthNames",
                new String[] {
                    "\u043c\u0443\u0445\u0430\u0440\u0435\u043c",
                    "\u0441\u0430\u0444\u0430\u0440",
                    "\u0440\u0430\u0431\u0438 I",
                    "\u0440\u0430\u0431\u0438 II",
                    "\u045f\u0443\u043c\u0430\u0434\u0430 I",
                    "\u045f\u0443\u043c\u0430\u0434\u0430 II",
                    "\u0440\u0430\u045f\u0430\u0431",
                    "\u0448\u0430\u0431\u0430\u043d",
                    "\u0440\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0448\u0430\u0432\u0430\u043b",
                    "\u0434\u0443\u043b\u043a\u0438\u0434\u0430",
                    "\u0434\u0443\u043b\u0445\u0438\u045f\u0430",
                    "",
                }
            },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "generic.DateFormatItem.yyyyQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "islamic.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "field.second", "\u0441\u0435\u043a\u0443\u043d\u0434\u0430" },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:00:00-04:00;morning2:10:00-12:00;afternoon1:12:00-18:00;morning1:04:00-10:00;evening1:18:00-24:00" },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "islamic.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "DayNames", metaValue_generic_DayNames },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-civil.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMEd", metaValue_generic_DateFormatItem_yyyyMEd },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d.M.y",
                    "d.M.yy",
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
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
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
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u0408\u0430\u043f\u043e\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "japanese.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "long.Eras",
                new String[] {
                    "\u043f\u0440\u0435\u0434 \u043d\u0430\u0448\u0430\u0442\u0430 \u0435\u0440\u0430",
                    "\u043e\u0434 \u043d\u0430\u0448\u0430\u0442\u0430 \u0435\u0440\u0430",
                }
            },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "field.era", "\u0435\u0440\u0430" },
            { "field.dayperiod", "\u043f\u0440\u0435\u0442\u043f\u043b\u0430\u0434\u043d\u0435/\u043f\u043e\u043f\u043b\u0430\u0434\u043d\u0435" },
            { "japanese.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "field.month", "\u043c\u0435\u0441\u0435\u0446" },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "japanese.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "roc.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "generic.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_yyyy },
            { "islamic.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "Eras",
                new String[] {
                    "\u043f.\u043d.\u0435.",
                    "\u043d.\u0435.",
                }
            },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "field.weekday", "\u0434\u0435\u043d \u043e\u0434 \u043d\u0435\u0434\u0435\u043b\u0430\u0442\u0430" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "japanese.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
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
                    "{one:0\u00a0\u0438\u043b\u0458'.' other:0\u00a0\u0438\u043b\u0458'.'}",
                    "{one:00\u00a0\u0438\u043b\u0458'.' other:00\u00a0\u0438\u043b\u0458'.'}",
                    "{one:000\u00a0\u0438\u043b\u0458'.' other:000\u00a0\u0438\u043b\u0458'.'}",
                    "{one:0\u00a0\u043c\u0438\u043b'.' other:0\u00a0\u043c\u0438\u043b'.'}",
                    "{one:00\u00a0\u043c\u0438\u043b'.' other:00\u00a0\u043c\u0438\u043b'.'}",
                    "{one:000\u00a0\u041c other:000\u00a0\u041c}",
                    "{one:0\u00a0\u043c\u0438\u043b\u0458'.' other:0\u00a0\u043c\u0438\u043b\u0458'.'}",
                    "{one:00\u00a0\u043c\u0438\u043b\u0458'.' other:00\u00a0\u043c\u0438\u043b\u0458'.'}",
                    "{one:000\u00a0\u043c\u0458'.' other:000\u00a0\u043c\u0438'.'}",
                    "{one:0\u00a0\u0431\u0438\u043b'.' other:0\u00a0\u0431\u0438\u043b'.'}",
                    "{one:00\u00a0\u0431\u0438\u043b'.' other:00\u00a0\u0431\u0438\u043b'.'}",
                    "{one:000\u00a0\u0431\u0438\u043b'.' other:000\u00a0\u0431\u0438\u043b'.'}",
                }
            },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.hour", "\u0447\u0430\u0441" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u043c\u0443\u0445.",
                    "\u0441\u0430\u0444.",
                    "\u0440\u0430\u0431. I",
                    "\u0440\u0430\u0431. II",
                    "\u045f\u0443\u043c. I",
                    "\u045f\u0443\u043c. II",
                    "\u0440\u0430\u045f.",
                    "\u0448\u0430\u0431.",
                    "\u0440\u0430\u043c.",
                    "\u0448\u0430\u0432.",
                    "\u0434\u0443\u043b\u043a.",
                    "\u0434\u0443\u043b\u0445.",
                    "",
                }
            },
            { "calendarname.buddhist", "\u0411\u0443\u0434\u0438\u0441\u0442\u0438\u0447\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "calendarname.islamic-umalqura", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440 (\u0423\u043c \u0430\u043b-\u041a\u0443\u0440\u0430)" },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yyyyMd },
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
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "DateTimePatterns",
                new String[] {
                    "{1}, '\u0432\u043e' {0}",
                    "{1}, '\u0432\u043e' {0}",
                    "{1}, '\u0432\u043e' {0}",
                    "{1}, '\u0432\u043e' {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
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
            { "islamic.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.DateFormatItem.yyyyMEd", metaValue_generic_DateFormatItem_yyyyMEd },
            { "roc.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "buddhist.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "calendarname.islamic", "\u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "islamic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_yyyy },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "japanese.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "\u0412\u0440\u0435\u043c\u0435 \u0432\u043e {0}" },
            { "islamic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "roc.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "islamic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "buddhist.DateFormatItem.Bhms", metaValue_buddhist_DateFormatItem_Bhms },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "islamic.DateFormatItem.EBhms", metaValue_buddhist_DateFormatItem_EBhms },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
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
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "buddhist.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "japanese.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "field.year", "\u0433\u043e\u0434\u0438\u043d\u0430" },
            { "islamic-umalqura.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-umalqura.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "narrow.Eras",
                new String[] {
                    "BCE",
                    "\u043d.\u0435.",
                }
            },
            { "roc.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-umalqura.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "japanese.DateFormatItem.Bhm", metaValue_buddhist_DateFormatItem_Bhm },
            { "roc.DateFormatItem.EBhm", metaValue_buddhist_DateFormatItem_EBhm },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_GyMMMEd },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "roc.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "calendarname.roc", "\u041c\u0438\u043d\u0433\u0443\u043e-\u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yyyyM },
            { "roc.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
            { "generic.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "islamic.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "islamic.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "roc.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "buddhist.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
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
                    "{one:0' '\u0438\u043b\u0458\u0430\u0434\u0430 other:0' '\u0438\u043b\u0458\u0430\u0434\u0438}",
                    "{one:00' '\u0438\u043b\u0458\u0430\u0434\u0430 other:00' '\u0438\u043b\u0458\u0430\u0434\u0438}",
                    "{one:000' '\u0438\u043b\u0458\u0430\u0434\u0430 other:000' '\u0438\u043b\u0458\u0430\u0434\u0438}",
                    "{one:0' '\u043c\u0438\u043b\u0438\u043e\u043d other:0' '\u043c\u0438\u043b\u0438\u043e\u043d\u0438}",
                    "{one:00' '\u043c\u0438\u043b\u0438\u043e\u043d other:00' '\u043c\u0438\u043b\u0438\u043e\u043d\u0438}",
                    "{one:000' '\u043c\u0438\u043b\u0438\u043e\u043d other:000' '\u043c\u0438\u043b\u0438\u043e\u043d\u0438}",
                    "{one:0' '\u043c\u0438\u043b\u0438\u0458\u0430\u0440\u0434\u0430 other:0' '\u043c\u0438\u043b\u0438\u0458\u0430\u0440\u0434\u0438}",
                    "{one:00' '\u043c\u0438\u043b\u0438\u0458\u0430\u0440\u0434\u0430 other:00' '\u043c\u0438\u043b\u0438\u0458\u0430\u0440\u0434\u0438}",
                    "{one:000' '\u043c\u0438\u043b\u0438\u0458\u0430\u0440\u0434\u0430 other:000' '\u043c\u0438\u043b\u0438\u0458\u0430\u0440\u0434\u0438}",
                    "{one:0' '\u0431\u0438\u043b\u0438\u043e\u043d other:0' '\u0431\u0438\u043b\u0438\u043e\u043d\u0438}",
                    "{one:00' '\u0431\u0438\u043b\u0438\u043e\u043d other:00' '\u0431\u0438\u043b\u0438\u043e\u043d\u0438}",
                    "{one:000' '\u0431\u0438\u043b\u0438\u043e\u043d other:000' '\u0431\u0438\u043b\u0438\u043e\u043d\u0438}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-umalqura.DateFormatItem.MMM", metaValue_buddhist_DateFormatItem_MMM },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.yyyyQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "field.zone", "\u0432\u0440\u0435\u043c\u0435\u043d\u0441\u043a\u0430 \u0437\u043e\u043d\u0430" },
            { "buddhist.DateFormatItem.Mdd", metaValue_generic_DateFormatItem_Mdd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Bh", metaValue_buddhist_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.EHms", metaValue_buddhist_DateFormatItem_EHms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_buddhist_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.DateFormatItem.yyyyMEd", metaValue_generic_DateFormatItem_yyyyMEd },
            { "islamic.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yyyyM },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_GyMMM },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.hm", metaValue_buddhist_DateFormatItem_hm },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.yyyyQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.Ehm", metaValue_buddhist_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.h", metaValue_buddhist_DateFormatItem_h },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.d", metaValue_buddhist_DateFormatItem_d },
            { "buddhist.DateFormatItem.Hm", metaValue_buddhist_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.y", metaValue_generic_DateFormatItem_y },
            { "buddhist.DateFormatItem.yyyyQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "roc.DateFormatItem.Hms", metaValue_buddhist_DateFormatItem_Hms },
            { "field.week", "\u0441\u0435\u0434\u043c\u0438\u0446\u0430" },
            { "islamic.DateFormatItem.ms", metaValue_buddhist_DateFormatItem_ms },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.DateFormatItem.yyyyQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "roc.DateFormatItem.EHm", metaValue_buddhist_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.H", metaValue_buddhist_DateFormatItem_H },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.E", metaValue_buddhist_DateFormatItem_E },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Mdd },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "PluralRules", "one:v = 0 and i % 10 = 1 and i % 100 != 11 or f % 10 = 1 and f % 100 != 11" },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.hms", metaValue_buddhist_DateFormatItem_hms },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yyyyM },
            { "buddhist.DateFormatItem.M", metaValue_buddhist_DateFormatItem_M },
        };
        return data;
    }
}
