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

public class FormatData_es_US extends ListResourceBundle {
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
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd/MM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "EEE, d 'de' MMM 'de' y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d/M/y";
        final String metaValue_generic_DateFormatItem_GyMMMd = "d MMM y G";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_Hmsvvvv = "HH:mm:ss (vvvv)";
        final String metaValue_generic_DateFormatItem_MMd = "d/MM";
        final String metaValue_generic_DateFormatItem_yMM = "MM/y";
        final String metaValue_DateFormatItem_Ehms = "E h:mm:ss a";
        final String metaValue_DateFormatItem_Ehm = "E h:mm a";
        final String metaValue_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_DateFormatItem_EHm = "E HH:mm";
        final String metaValue_DateFormatItem_MMMEd = "E, d 'de' MMM";
        final String[] metaValue_short_CompactNumberPatterns = new String[] {
            "",
            "",
            "",
            "{one:0\u00a0K other:0\u00a0K}",
            "{one:00\u00a0K other:00\u00a0K}",
            "{one:000\u00a0K other:000\u00a0K}",
        };
        final Object[][] data = new Object[][] {
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "roc.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "japanese.DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
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
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "japanese.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "buddhist.DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-civil.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "long.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
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
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "roc.DateFormatItem.MMMEd", metaValue_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "roc.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "roc.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "generic.DateFormatItem.yyyyMEd", "E, d/M/y GGGGG" },
            { "short.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "d MMM y",
                    "d/M/y",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
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
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
        };
        return data;
    }
}
