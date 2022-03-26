package org.pcha.benthos.language;

import com.intellij.testFramework.ParsingTestCase;

public class BloblangParsingTest extends ParsingTestCase{
    public BloblangParsingTest() {
        super("", "blobl", new BloblangParserDefinition());
    }

    public void testParsingTestData() {
        doTest(true);
    }

    /**
     * @return path to test data file directory relative to root of this module.
     */
    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}