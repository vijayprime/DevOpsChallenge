package com.vdsi.hackathon.functionaltests.scenarios;


import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class ParticipantInfoScenarios extends BasicAcceptanceConfiguration
{

    @Override
    public List<CandidateSteps> candidateSteps()
    {
        return new InstanceStepsFactory(configuration(), new ParticipantInfoSteps())
                .createCandidateSteps();
    }
}
