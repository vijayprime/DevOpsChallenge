package com.vdsi.hackathon.functionaltests.scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.StoryReporterBuilder.Format;
import org.junit.Test;

public abstract class BasicAcceptanceConfiguration extends JUnitStory
{

    public BasicAcceptanceConfiguration()
    {
        super();
    }

    @Override
    public Configuration configuration()
    {
        URL storyURL = null;
        try
        {
            storyURL = new URL("file://" + System.getProperty("user.dir")
                    + "/DevOpsChallenge-service/src/test/resources/stories/");
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        return new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromRelativeFile(storyURL)).useStoryReporterBuilder(
                        new StoryReporterBuilder().withFormats(Format.CONSOLE, Format.TXT,
                                Format.HTML));
    }

    @Override
    @Test
    public void run()
    {
        try
        {
            super.run();
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
    }

}