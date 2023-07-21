package uk.adbsalam.snapit.utils

import org.intellij.lang.annotations.Language

open class KPTest(private val caseDir: String = "") {
    /**
     *
     */
    internal fun kspCodeFromFile(file: String): String {
        @Language("kotlin")
        val fileContent = KPTest::class.java.getResource("/$caseDir/$file.txt")?.readText()
        return fileContent.orEmpty()
    }

}