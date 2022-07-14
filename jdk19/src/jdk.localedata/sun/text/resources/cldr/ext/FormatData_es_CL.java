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

public class FormatData_es_CL extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y G",
            "d 'de' MMMM 'de' y G",
            "dd-MM-y G",
            "dd-MM-y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y GGGG",
            "d 'de' MMMM 'de' y GGGG",
            "dd-MM-y GGGG",
            "dd-MM-y G",
        };
        final String metaValue_generic_DateFormatItem_yMEd = "E dd-MM-y";
        final String metaValue_generic_DateFormatItem_GyMMMd = "d MMM y G";
        final String metaValue_generic_DateFormatItem_Md = "dd-MM";
        final String metaValue_generic_DateFormatItem_MEd = "E, dd-MM";
        final String metaValue_generic_DateFormatItem_yMd = "dd-MM-y";
        final String metaValue_generic_DateFormatItem_yM = "MM-y";
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
            "",
            "",
            "dd-MM-y G",
            "dd-MM-y GGGGG",
        };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
            "",
            "",
            "dd-MM-y GGGG",
            "dd-MM-y G",
        };
        final Object[][] data = new Object[][] {
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
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
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "generic.DateFormatItem.yyyyM", "MM-y G" },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yyyyMd", "dd-MM-y G" },
            { "generic.DateFormatItem.yyyyMEd", "E dd-MM-y G" },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "dd-MM-y",
                    "dd-MM-yy",
                }
            },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "ene.",
                    "feb.",
                    "mar.",
                    "abr.",
                    "may.",
                    "jun.",
                    "jul.",
                    "ago.",
                    "sept.",
                    "oct.",
                    "nov.",
                    "dic.",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00;\u00a4-#,##0.00",
                    "#,##0\u00a0%",
                    "\u00a4#,##0.00",
                }
            },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "standalone.QuarterNames",
                new String[] {
                    "1.\u00b0 trimestre",
                    "2.\u00b0 trimestre",
                    "3.\u00b0 trimestre",
                    "4.\u00ba trimestre",
                }
            },
        };
        return data;
    }
}
