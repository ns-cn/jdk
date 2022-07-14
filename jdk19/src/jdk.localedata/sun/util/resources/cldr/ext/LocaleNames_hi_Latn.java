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

package sun.util.resources.cldr.ext;

import sun.util.resources.OpenListResourceBundle;

public class LocaleNames_hi_Latn extends OpenListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_bn = "Bangla";
        final Object[][] data = new Object[][] {
            { "type.nu.orya", "Odia Digits" },
            { "Beng", metaValue_bn },
            { "Bali", "Baali" },
            { "key.ms", "Measurement kaa system" },
            { "mus", "Muscogee" },
            { "bn", metaValue_bn },
            { "ht", "Haitian" },
            { "bo", "Tibbati" },
            { "ug", "Uighur" },
            { "type.hc.h23", "24 Hour System (0\u201323)" },
            { "type.hc.h24", "24 Hour System (1\u201324)" },
            { "type.d0.hwidth", "Aadhi width" },
            { "UM", "U.S. Outlying Islands" },
            { "crh", "Crimean Turkish" },
            { "type.co.compat", "Compatibility ke liye, picchla sort order" },
            { "nan", "Min Nan" },
            { "wal", "walamo" },
            { "af", "Afreeki" },
            { "type.co.reformed", "Reform kiya gaya Sort Order" },
            { "XB", "Pseudo-Bidirectional" },
            { "nds_NL", "Low Saxon" },
            { "type.d0.npinyin", "Numeric tones ke saath pinyin karna" },
            { "Orya", "Odia" },
            { "Talu", "Naya Tai Lue" },
            { "type.ca.islamic-civil", "Islamic Civil Calendar (tabular, civil epoch)" },
            { "as", "Aasaami" },
            { "VI", "U.S. Virgin Islands" },
            { "type.hc.h12", "12 Hour System (1\u201312)" },
            { "type.co.dictionary", "Dictionary kaa sort order" },
            { "Inds", "Sindhu" },
            { "type.nu.beng", "Bangla Digits" },
            { "key.hc", "Hours ki Cycle (12 vs 24)" },
            { "type.hc.h11", "12 Hour System (0\u201311)" },
            { "key.lb", "Line break ki style" },
            { "type.co.searchjl", "Hangul initial consonant se search karein" },
            { "fa", "Faarsi" },
            { "ckb", "Kurdish, Sorani" },
            { "type.d0.fwidth", "Poori width" },
        };
        return data;
    }
}
