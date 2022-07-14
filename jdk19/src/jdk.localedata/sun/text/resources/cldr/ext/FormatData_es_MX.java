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

public class FormatData_es_MX extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNarrows = new String[] {
            "D",
            "L",
            "M",
            "M",
            "J",
            "V",
            "S",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1.er trimestre",
            "2.\u00ba trimestre",
            "3.er trimestre",
            "4.\u00ba trimestre",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a.\u00a0m.",
            "p.\u00a0m.",
            "",
            "del mediod\u00eda",
            "de la madrugada",
            "ma\u00f1ana",
            "",
            "",
            "de la tarde",
            "",
            "de la noche",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y G",
            "d 'de' MMMM 'de' y G",
            "d MMM, y G",
            "d/M/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y GGGG",
            "d 'de' MMMM 'de' y GGGG",
            "d MMM, y GGGG",
            "d/M/y G",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd/MM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "EEE, d 'de' MMM 'de' y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d/M/y";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM y G";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_Hmsvvvv = "HH:mm:ss (vvvv)";
        final String metaValue_generic_DateFormatItem_MMd = "d/MM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E d 'de' MMM";
        final String metaValue_generic_DateFormatItem_yMM = "MM/y";
        final String[] metaValue_QuarterNarrows = new String[] {
            "1T",
            "2T",
            "3T",
            "4T",
        };
        final String metaValue_DateFormatItem_Ehms = "E h:mm:ss a";
        final String metaValue_DateFormatItem_Ehm = "E h:mm a";
        final String metaValue_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_DateFormatItem_EHm = "E HH:mm";
        final Object[][] data = new Object[][] {
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "roc.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.hms", "hh:mm:ss a" },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.hm", "hh:mm a" },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.h", "hh a" },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1} {0}",
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
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "japanese.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "calendarname.roc", "calendario minguo" },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-civil.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "{one:0' 'bill\u00f3n other:0' 'billones}",
                    "{one:00' 'billones other:00' 'billones}",
                    "{one:000' 'billones other:000' 'billones}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "japanese.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic-civil.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "roc.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yyyyMMM", "MMM y G" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yyyyMMMEd", "EEE, d MMM y G" },
            { "islamic-civil.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "roc.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "generic.DateFormatItem.yyyyMEd", "E, d/M/y GGGGG" },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0k other:0\u00a0k}",
                    "{one:00\u00a0k other:00\u00a0k}",
                    "{one:000\u00a0k other:000\u00a0k}",
                }
            },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "d MMM y",
                    "dd/MM/yy",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0\u00a0%",
                    "\u00a4#,##0.00",
                }
            },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
        };
        return data;
    }
}
