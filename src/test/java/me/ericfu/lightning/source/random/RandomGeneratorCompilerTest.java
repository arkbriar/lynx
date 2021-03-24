package me.ericfu.lightning.source.random;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomGeneratorCompilerTest {

    @Test
    public void testCompileExpression() throws Exception {
        RandomGenerator generator = new RandomGeneratorCompiler().compile("String.format(\"%06d\", rownum)");
        Assert.assertEquals("000999", generator.generate(999, new Random()));
    }

    @Test
    public void testCompileCodeBlock() throws Exception {
        RandomGenerator generator = new RandomGeneratorCompiler().compile(
            "{ return String.format(\"%06d\", rownum); }");
        Assert.assertEquals("000999", generator.generate(999, new Random()));
    }
}