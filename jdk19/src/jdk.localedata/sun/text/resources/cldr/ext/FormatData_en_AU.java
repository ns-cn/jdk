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

public class FormatData_en_AU extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNarrows = new String[] {
            "Su.",
            "M.",
            "Tu.",
            "W.",
            "Th.",
            "F.",
            "Sa.",
        };
        final String[] metaValue_generic_QuarterNarrows = new String[] {
            "1",
            "2",
            "3",
            "4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "am",
            "pm",
            "midnight",
            "midday",
            "in the morning",
            "",
            "in the afternoon",
            "",
            "in the evening",
            "",
            "at night",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "am",
            "pm",
            "midnight",
            "midday",
            "morning",
            "",
            "afternoon",
            "",
            "evening",
            "",
            "night",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String metaValue_generic_DateFormatItem_yMEd = "E, dd/MM/y";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_MEd = "E, d/M";
        final String metaValue_generic_DateFormatItem_yMd = "dd/MM/y";
        final String[] metaValue_MonthAbbreviations = new String[] {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "June",
            "July",
            "Aug",
            "Sept",
            "Oct",
            "Nov",
            "Dec",
            "",
        };
        final String[] metaValue_buddhist_MonthNarrows = new String[] {
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
        };
        final String metaValue_islamic_DateFormatItem_yyyyMMMd = "d MMM y G";
        final String metaValue_islamic_DateFormatItem_Gy = "y G";
        final String metaValue_islamic_DateFormatItem_yyyyMMMEd = "E, d MMM y G";
        final String metaValue_islamic_DateFormatItem_yyyyMMM = "MMM y G";
        final Object[][] data = new Object[][] {
            { "islamic.DateFormatItem.d", "d" },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.MMMEd", "E, d MMM" },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "islamic.DateFormatItem.yyyyMMMEd", metaValue_islamic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.MMMMd", "d MMMM" },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_islamic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "islamic.DateFormatItem.yyyyMd", "dd/MM/y GGGGG" },
            { "generic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DateFormatItem.MMM", "LLL" },
            { "roc.MonthNarrows", metaValue_buddhist_MonthNarrows },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.GyMMM", metaValue_islamic_DateFormatItem_yyyyMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.yyyyMMM", metaValue_islamic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.E", "ccc" },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yyyyM", "MM/y GGGGG" },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic.DateFormatItem.M", "LL" },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "dd/MM/y GGGGG",
                }
            },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateTimePatterns",
                new String[] {
                    "{1} 'at' {0}",
                    "{1} 'at' {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
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
                    "e",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yyyyMEd", "E, dd/MM/y GGGGG" },
            { "japanese.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "dd/MM/y G",
                }
            },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.Gy", metaValue_islamic_DateFormatItem_Gy },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_islamic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "buddhist.MonthNarrows", metaValue_buddhist_MonthNarrows },
            { "islamic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "islamic.DateFormatItem.yyyy", metaValue_islamic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.Ed", "E d" },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "Jan",
                    "Feb",
                    "Mar",
                    "Apr",
                    "May",
                    "Jun",
                    "Jul",
                    "Aug",
                    "Sep",
                    "Oct",
                    "Nov",
                    "Dec",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "buddhist.QuarterNarrows", metaValue_generic_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.yyyyMMMd", metaValue_islamic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.MMMd", "d MMM" },
            { "japanese.MonthNarrows", metaValue_buddhist_MonthNarrows },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DateFormatItem.y", metaValue_islamic_DateFormatItem_Gy },
        };
        return data;
    }
}
