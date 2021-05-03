package org.jenkinsci.plugins.awsdevicefarm;

import io.jenkins.plugins.casc.misc.ConfiguredWithCode;
import io.jenkins.plugins.casc.misc.JenkinsConfiguredWithCodeRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AWSDeviceFarmJCasCTest {

    @Rule public JenkinsConfiguredWithCodeRule r = new JenkinsConfiguredWithCodeRule();

    @Test
    @ConfiguredWithCode("casc.yml")
    public void should_support_configuration_as_code() throws Exception {
        AWSDeviceFarmRecorder dfr = new AWSDeviceFarmRecorder(null, null, null, null, null, null,"test", false, false, null, null, null,null, null, null, null, null, null,null, null, null, null, null, null,null, null, null, null, null, null,null, null, null, null, false, false,null, false, Double.MIN_VALUE, Double.MIN_VALUE, false, false,false, false, false, 0, false, false,false, false, false, null);
        assertTrue(dfr.getDescriptor().getRoleArn().equals("roleArnTest"));
        assertTrue(dfr.getDescriptor().getAkid().equals("akidTest"));
        assertTrue(dfr.getDescriptor().getSkid().equals("skidTest"));
    }
}
