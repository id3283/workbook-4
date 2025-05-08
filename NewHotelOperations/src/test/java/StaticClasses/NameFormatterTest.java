package StaticClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {



    @Test
    void testFormatAllParts() {
        String actual = NameFormatter.format("Dr", "Mel", "Beelzabub", "Diablo", "PhD");

        assertEquals("Dr. Mel Beelzabub Diablo, PhD", actual);
    }

    @Test
    void testFormatNoMiddleName() {
        String actual = NameFormatter.format("Dr", "Mel", null, "Diablo", "PhD");

        assertEquals("Dr. Mel Diablo, PhD", actual);
    }
    @Test
    void testFormatNoMiddleNameRay() {
        String actual = NameFormatter.format("Dr", "Ray", null, "Scardriver", "MD");

        assertEquals("Dr. Ray Scardriver, MD", actual);
    }

    @Test
    void format_AllPartsProvided() {
        String result = NameFormatter.format("Mr", "John", "H", "Doe", "Jr");
        assertEquals("Mr. John H Doe, Jr", result);
    }

    @Test
    void format_NoPrefixNoSuffix() {
        String result = NameFormatter.format(null, "Jane", null, "Smith", null);
        assertEquals("Jane Smith", result);
    }

    @Test
    void format_EmptyStringsAllAround() {
        String result = NameFormatter.format("", "", "", "", "");
        assertEquals("", result);
    }

    @Test
    void format_PrefixOnly() {
        String result = NameFormatter.format("Dr", "", "", "", "");
        assertEquals("Dr. ", result);
    }

    @Test
    void format_FirstOnly() {
        String result = NameFormatter.format("", "Bob", "", "", "");
        assertEquals("Bob ", result);
    }

    @Test
    void format_LastOnly() {
        String result = NameFormatter.format("", "", "", "Smith", "");
        assertEquals("Smith", result);
    }

    @Test
    void format_MiddleOnly() {
        String result = NameFormatter.format("", "", "K", "", "");
        assertEquals("K ", result);
    }

    @Test
    void format_FirstAndLastOnly() {
        String result = NameFormatter.format(null, "Alice", "", "Wonderland", null);
        assertEquals("Alice Wonderland", result);
    }

    @Test
    void format_AllNulls() {
        String result = NameFormatter.format(null, null, null, null, null);
        assertEquals("", result);
    }
}