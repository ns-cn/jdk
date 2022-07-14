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

public class FormatData_hi_Latn extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "ravivaar",
            "somvaar",
            "mangalvaar",
            "budhvaar",
            "guruvaar",
            "shukravaar",
            "shanivaar",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "ravi",
            "som",
            "mangal",
            "budh",
            "guru",
            "shukra",
            "shani",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "ra",
            "so",
            "ma",
            "bu",
            "gu",
            "su",
            "sa",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "aadhi raat",
            "noon",
            "subah",
            "",
            "dopahar",
            "",
            "shaam",
            "",
            "raat",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "mi",
            "n",
            "in the morning",
            "",
            "in the afternoon",
            "",
            "in the evening",
            "",
            "at night",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y G",
            "d MMMM, y G",
            "d MMM, y G",
            "d/M/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y GGGG",
            "d MMMM, y GGGG",
            "d MMM, y GGGG",
            "d/M/y G",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
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
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "Hijri",
        };
        final Object[][] data = new Object[][] {
            { "field.year", "saal" },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "calendarname.islamic-civil", "Islamic Civil Calendar (tabular, civil epoch)" },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.DateFormatItem.Bhms", "h:mm.ss B" },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1} {0}",
                    "{1} {0}",
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
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.MonthNames",
                new String[] {
                    "Muharram",
                    "Safar",
                    "Rabi al-Awwal",
                    "Rabi as-Saani",
                    "Jumaada al-Awwal",
                    "Jumaada as-Saani",
                    "Rajab",
                    "Shaabaan",
                    "Ramzaan",
                    "Shawwaal",
                    "Zu\u2019l-Qaada",
                    "Zu\u2019l-Hijja",
                    "",
                }
            },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNames", metaValue_generic_DayNames },
            { "field.month", "mahina" },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "field.week", "hafta" },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateFormatItem.yyyyMd", "d/M/y GGGGG" },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0hazaar other:0\u00a0hazaar}",
                    "{one:00\u00a0hazaar other:00\u00a0hazaar}",
                    "{one:0\u00a0laakh other:0\u00a0laakh}",
                    "{one:00\u00a0laakh other:00\u00a0laakh}",
                    "{one:0\u00a0ka'.' other:0\u00a0ka'.'}",
                    "{one:00\u00a0ka'.' other:00\u00a0ka'.'}",
                    "{one:0\u00a0a'.' other:0\u00a0a'.'}",
                    "{one:00\u00a0a'.' other:00\u00a0a'.'}",
                    "{one:0\u00a0kha'.' other:0\u00a0kha'.'}",
                    "{one:00\u00a0kha'.' other:00\u00a0kha'.'}",
                    "{one:000\u00a0kha'.' other:000\u00a0kha'.'}",
                    "{one:0000\u00a0kha'.' other:0000\u00a0kha'.'}",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM, y",
                    "d MMMM y",
                    "dd-MMM-y",
                    "dd/MM/y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "field.hour", "ghanta" },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Muh",
                    "Saf",
                    "Rabi 1",
                    "Rabi 2",
                    "Jum 1",
                    "Jum 2",
                    "Rajab",
                    "Shab",
                    "Ram",
                    "Shaw",
                    "Zu Q",
                    "Zu H",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##,##0.###",
                    "\u00a4#,##,##0.00",
                    "#,##,##0%",
                    "\u00a4#,##,##0.00",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'hazaar other:0' 'hazaar}",
                    "{one:00' 'hazaar other:00' 'hazaar}",
                    "{one:0' 'laakh other:0' 'laakh}",
                    "{one:00' 'laakh other:00' 'laakh}",
                    "{one:0' 'karod other:0' 'karod}",
                    "{one:00' 'karod other:00' 'karod}",
                    "{one:0' 'arab other:0' 'arab}",
                    "{one:00' 'arab other:00' 'arab}",
                    "{one:0' 'kharab other:0' 'kharab}",
                    "{one:00' 'kharab other:00' 'kharab}",
                    "{one:000' 'kharab other:000' 'kharab}",
                    "{one:0000' 'kharab other:0000' 'kharab}",
                }
            },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
        };
        return data;
    }
}
