/*
 * Copyright (c) 2017-present, CV4J Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cv4j.core.datamodel.lut;

/**
 * The filter which is varies smoothly from red, through orange, to yellow.
 * <p>
 * For more information please see:
 * <a target="_blank" href="http://baike.baidu.com/link?url=kysXstK853g0mEbTgPIdkrqO5qTTbgfW-B0O1FJP4MYYzp
 * G5_6E_LlaP_6T9XTn2c97Ge6hJUojJzkppCdnO-mJxIee_XsNASTsy82RaQZe">About ColorMap</a> <p>
 * Or see:
 * <a target="_blank" href="http://matlab.izmiran.ru/help/techdoc/ref/colormap.html">MATLAB Function Reference - colormap</a>
 *
 */
public class AutumnLUT {

    public static int[][] AUTUMN_LUT = new int[][]{
            {254, 0, 0}, {255, 1, 1}, {255, 1, 0}, {255, 2, 0}, {255, 5, 0}, {255, 5, 0},
            {255, 7, 0}, {255, 7, 0}, {255, 8, 1}, {255, 9, 2}, {254, 10, 0}, {255, 11, 1},
            {254, 12, 0}, {255, 13, 1}, {255, 13, 0}, {255, 15, 0}, {255, 16, 0}, {254, 17, 0},
            {255, 18, 0}, {255, 18, 0}, {255, 20, 0}, {255, 21, 0}, {254, 22, 0}, {255, 23, 1},
            {254, 24, 0}, {255, 25, 1}, {255, 27, 0}, {255, 27, 0}, {255, 27, 0}, {255, 28, 0},
            {255, 30, 0}, {255, 30, 0}, {255, 32, 0}, {255, 33, 0}, {254, 34, 0}, {254, 34, 0},
            {255, 35, 0}, {255, 36, 1}, {255, 38, 0}, {255, 39, 0}, {255, 40, 0}, {254, 41, 0},
            {254, 43, 0}, {254, 43, 0}, {255, 44, 0}, {255, 45, 0}, {254, 46, 0}, {255, 47, 1},
            {254, 48, 0}, {255, 49, 0}, {255, 50, 0}, {255, 50, 0}, {255, 52, 0}, {255, 52, 0},
            {255, 54, 0}, {255, 55, 0}, {255, 56, 1}, {255, 57, 2}, {254, 58, 0}, {254, 58, 0},
            {254, 60, 0}, {255, 61, 0}, {255, 62, 0}, {255, 63, 0}, {255, 64, 0}, {254, 65, 0},
            {255, 66, 0}, {255, 67, 1}, {255, 68, 0}, {255, 68, 0}, {254, 70, 0}, {255, 71, 1},
            {255, 73, 0}, {255, 73, 0}, {255, 75, 0}, {255, 75, 0}, {255, 76, 0}, {255, 76, 0},
            {255, 78, 0}, {255, 79, 1}, {255, 80, 0}, {255, 81, 0}, {254, 82, 0}, {254, 83, 1},
            {255, 85, 0}, {254, 85, 0}, {255, 87, 0}, {255, 87, 0}, {255, 88, 0}, {255, 88, 0},
            {255, 90, 0}, {255, 91, 0}, {255, 93, 0}, {255, 93, 0}, {254, 94, 0}, {255, 95, 1},
            {255, 97, 0}, {255, 97, 0}, {255, 98, 1}, {255, 98, 1}, {254, 100, 0}, {255, 101, 1},
            {255, 102, 0}, {255, 103, 1}, {255, 103, 0}, {255, 104, 0}, {255, 105, 0}, {255, 107, 0},
            {255, 108, 0}, {255, 109, 0}, {255, 110, 1}, {255, 110, 1}, {254, 112, 0}, {255, 113, 1},
            {255, 115, 0}, {255, 115, 0}, {255, 116, 0}, {255, 117, 0}, {255, 119, 0}, {255, 119, 0},
            {255, 120, 2}, {255, 120, 2}, {255, 122, 1}, {255, 122, 1}, {254, 124, 0}, {255, 125, 1},
            {255, 126, 0}, {255, 127, 0}, {255, 128, 0}, {254, 129, 0}, {255, 130, 1}, {255, 130, 1},
            {255, 133, 0}, {255, 133, 0}, {255, 134, 1}, {255, 134, 1}, {254, 136, 0}, {255, 137, 1},
            {255, 139, 0}, {255, 139, 0}, {255, 140, 0}, {255, 141, 0}, {255, 142, 1}, {255, 142, 1},
            {255, 144, 0}, {255, 144, 0}, {255, 146, 1}, {255, 147, 2}, {255, 149, 1}, {255, 149, 1},
            {255, 150, 0}, {255, 151, 0}, {255, 152, 0}, {254, 153, 0}, {254, 155, 0}, {254, 155, 0},
            {255, 156, 0}, {255, 156, 0}, {255, 158, 1}, {255, 159, 2}, {254, 160, 0}, {255, 161, 1},
            {255, 162, 0}, {255, 163, 0}, {255, 165, 0}, {255, 165, 0}, {255, 167, 0}, {255, 167, 0},
            {255, 168, 1}, {255, 168, 1}, {255, 170, 1}, {255, 171, 2}, {255, 173, 1}, {255, 173, 1},
            {255, 173, 0}, {255, 175, 0}, {255, 177, 0}, {254, 177, 0}, {255, 178, 0}, {255, 179, 1},
            {255, 180, 0}, {255, 180, 0}, {255, 182, 0}, {255, 183, 1}, {254, 184, 0}, {255, 185, 1},
            {254, 186, 0}, {255, 187, 0}, {255, 188, 0}, {255, 188, 0}, {255, 190, 0}, {255, 190, 0},
            {255, 192, 0}, {255, 193, 0}, {254, 194, 0}, {255, 195, 1}, {255, 195, 0}, {255, 196, 1},
            {255, 197, 0}, {255, 199, 0}, {255, 200, 0}, {254, 201, 0}, {254, 203, 0}, {254, 203, 0},
            {255, 204, 0}, {255, 205, 0}, {254, 206, 0}, {255, 207, 1}, {254, 208, 0}, {255, 209, 1},
            {255, 210, 0}, {255, 210, 0}, {255, 212, 0}, {255, 212, 0}, {255, 214, 0}, {255, 214, 0},
            {255, 216, 1}, {255, 217, 2}, {255, 219, 1}, {255, 219, 1}, {254, 220, 0}, {255, 221, 0},
            {255, 222, 0}, {255, 223, 0}, {255, 224, 0}, {254, 225, 0}, {255, 226, 0}, {255, 226, 0},
            {255, 228, 0}, {255, 229, 0}, {254, 230, 0}, {255, 231, 1}, {254, 232, 0}, {255, 233, 0},
            {255, 235, 0}, {255, 235, 0}, {255, 236, 0}, {255, 236, 0}, {255, 238, 0}, {255, 239, 1},
            {255, 240, 0}, {255, 241, 0}, {255, 243, 1}, {255, 243, 1}, {255, 243, 0}, {255, 244, 0},
            {255, 246, 0}, {255, 247, 0}, {255, 248, 0}, {254, 249, 0}, {254, 251, 0}, {255, 252, 0},
            {255, 253, 0}, {255, 253, 0}, {254, 254, 0}, {255, 255, 1}
    };
}
