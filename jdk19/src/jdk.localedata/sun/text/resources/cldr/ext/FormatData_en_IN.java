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

public class FormatData_en_IN extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
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
            "d/M/y/ GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y GGGG",
            "d MMMM, y GGGG",
            "d MMM, y GGGG",
            "d/M/y/ G",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} 'at' {0}",
            "{1} 'at' {0}",
            "{1}, {0}",
            "{1}, {0}",
        };
        final String metaValue_generic_DateFormatItem_yyyyMMMM = "MMMM, y G";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM, y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d/M/y";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM, y G";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E, d MMM, y G";
        final String metaValue_generic_DateFormatItem_yyyyMd = "d/M/y G";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM, y G";
        final String metaValue_generic_DateFormatItem_MEd = "E, d/M";
        final String metaValue_generic_DateFormatItem_yyyyM = "M/y GGGGG";
        final String metaValue_generic_DateFormatItem_yMd = "d/M/y";
        final String metaValue_DateFormatItem_Ehms = "E, h:mm:ss a";
        final String metaValue_DateFormatItem_Ehm = "E, h:mm a";
        final String metaValue_DateFormatItem_EHms = "E, HH:mm:ss";
        final String metaValue_DateFormatItem_EHm = "E, HH:mm";
        final String[] metaValue_short_CompactNumberPatterns = new String[] {
            "",
            "",
            "",
            "{one:0T other:0T}",
            "{one:00T other:00T}",
            "{one:0L other:0L}",
            "{one:00L other:00L}",
            "{one:0Cr other:0Cr}",
            "{one:00Cr other:00Cr}",
            "{one:000Cr other:000Cr}",
            "{one:0TCr other:0TCr}",
            "{one:00TCr other:00TCr}",
            "{one:0LCr other:0LCr}",
            "{one:00LCr other:00LCr}",
            "{one:000LCr other:000LCr}",
        };
        final Object[][] data = new Object[][] {
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
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
            { "field.dayperiod", "AM/PM" },
            { "islamic.DateFormatItem.yyyyMEd", "E d/M/y G" },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM, y GGGG",
                    "dd-MMM-y GGGG",
                    "d/M/y/ G",
                }
            },
            { "generic.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yyyyM },
            { "generic.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "islamic.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "long.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "islamic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yyyyMMMM },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "japanese.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yyyyM },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM, y G",
                    "dd-MMM-y G",
                    "d/M/y/ GGGGG",
                }
            },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "roc.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "roc.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "generic.DateFormatItem.yyyyMEd", "E, d/M/y GGGGG" },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "short.CompactNumberPatterns", metaValue_short_CompactNumberPatterns },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM, y",
                    "d MMMM y",
                    "dd-MMM-y",
                    "dd/MM/yy",
                }
            },
            { "roc.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##,##0.###",
                    "\u00a4#,##,##0.00",
                    "#,##,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
        };
        return data;
    }
}
