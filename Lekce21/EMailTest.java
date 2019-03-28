import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import java.util.Map;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 
@RunWith(value = Parameterized.class)

//parametrizovane testy
public class EMailTest {
	@Parameters(name = "{0}") //nula mi vypise prvni argument
	public static Collection<Object[]> data() {
	    return Arrays.asList(new Object[][]{
	            { "a: alfa\nb: bravo\nc: charlie\n\n...", 
	            	new String[] {
	            	"a", "alfa",
	            	"b", "bravo",
	            	"c", "charlie"}},
	            { "ab: zulu\ncde: yankee\nfghi :x-ray\n\n...",
	            	new String[] {
	            	"ab", "zulu",
	            	"cde", "yankee", 
	            	"fghi", "x-ray", }},
	            { "ab: zulu\nab: yankee\n\n",
	            	new String[] {
	            	"ab", "yankee"}
	            },
	    });
	}
	
	private final String input;
	private final String[] values;
	
	public EMailTest(String input, String[] values) {
		this.input = input;
		this.values = values;
	}

	
	@Test
	public void Otestuj() {
		Map<String, String> vysl = EMail.nactiHlavicku(new Scanner(input));
		for (int i = 0; i < values.length; i += 2) {
			assertEquals(values[i+1], vysl.get(values[i]));
		}
		assertEquals(values.length / 2, vysl.size());
	}
}
