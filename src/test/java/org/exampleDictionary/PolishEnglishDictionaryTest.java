package org.exampleDictionary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PolishEnglishDictionaryTest {

    @Test
    public void translatePolishToEnglishAnimal() throws Exception {
        PolishEnglishDictionary.fillOutPolishDictionaryWords();
        assertEquals("dog",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("pies"));
        assertEquals("cat",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("kot"));
        assertEquals("bird",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("ptak"));
        assertEquals("crocodile",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("krokodyl"));
        assertEquals("horse",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("koń"));
        assertEquals("panda",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("panda"));
        assertEquals("eagle",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("orzeł"));
        assertEquals("lion",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("lew"));
        assertEquals("fish",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("ryba"));
        assertEquals("monkey",PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("małpa"));
        assertNull(PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("mysz"));
        assertNull(PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                (""));
        assertNull(PolishEnglishDictionary.translateToEnglishAnimalWordAndReturnIt
                ("1p"));
    }

    @Test
    public void translateEnglishToPolishAnimal() throws Exception {
        PolishEnglishDictionary.fillOutEnglishDictionaryWords();
        assertEquals("pies",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("dog"));
        assertEquals("kot",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("cat"));
        assertEquals("ptak",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("bird"));
        assertEquals("krokodyl",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("crocodile"));
        assertEquals("koń",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("horse"));
        assertEquals("panda",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("panda"));
        assertEquals("orzeł",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("eagle"));
        assertEquals("lew",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("lion"));
        assertEquals("ryba",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("fish"));
        assertEquals("małpa",PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("monkey"));
        assertNull(PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("mouse"));
        assertNull(PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                (""));
        assertNull(PolishEnglishDictionary.translateToPolishAnimalWordAndReturnIt
                ("1p"));
    }
}
