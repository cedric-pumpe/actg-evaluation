package de.wwu.dmnHelper;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

import org.camunda.bpm.dmn.engine.DmnDecision;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.dmn.engine.DmnEngine;
import org.camunda.bpm.dmn.engine.test.DmnEngineRule;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.junit.Rule;
import org.junit.Test;

public class GeneratedDmnUnitTests2 {

        @Rule
        public DmnEngineRule rule = new DmnEngineRule();

        @Test
        public void testDmnDecisionEvaluationForTestCase1() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 0);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Check that no more rules than expected have matched 
                assertThat(results).hasSize(1); 

                // Check that expected outputs are returned 
                List<Map<String, Object>> result = results.getResultList(); 
                List<Map<String, Object>> expectedResults = Arrays.asList( 
                        ImmutableMap.of("eligibility", "Rejected")
                ); 
                assertThat(result).containsExactlyInAnyOrderElementsOf(expectedResults); 
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase2() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 1999);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Check that no more rules than expected have matched 
                assertThat(results).hasSize(1); 

                // Check that expected outputs are returned 
                List<Map<String, Object>> result = results.getResultList(); 
                List<Map<String, Object>> expectedResults = Arrays.asList( 
                        ImmutableMap.of("eligibility", "Rejected")
                ); 
                assertThat(result).containsExactlyInAnyOrderElementsOf(expectedResults); 
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase3() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 123.456789);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Verify that expected output is NOT returned 
                List<Map<String, Object>> result = results.getResultList(); 
                Map<String, Object> input = new HashMap<>();
                    input.put("eligibility", "Approved");
                assertThat(result).doesNotContain(input);
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase4() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 2000);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Check that no more rules than expected have matched 
                assertThat(results).hasSize(1); 

                // Check that expected outputs are returned 
                List<Map<String, Object>> result = results.getResultList(); 
                List<Map<String, Object>> expectedResults = Arrays.asList( 
                        ImmutableMap.of("eligibility", "Rejected")
                ); 
                assertThat(result).containsExactlyInAnyOrderElementsOf(expectedResults); 
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase5() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 3999);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Check that no more rules than expected have matched 
                assertThat(results).hasSize(1); 

                // Check that expected outputs are returned 
                List<Map<String, Object>> result = results.getResultList(); 
                List<Map<String, Object>> expectedResults = Arrays.asList( 
                        ImmutableMap.of("eligibility", "Rejected")
                ); 
                assertThat(result).containsExactlyInAnyOrderElementsOf(expectedResults); 
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase6() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 123.456789);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Verify that expected output is NOT returned 
                List<Map<String, Object>> result = results.getResultList(); 
                Map<String, Object> input = new HashMap<>();
                    input.put("eligibility", "Approved");
                assertThat(result).doesNotContain(input);
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase7() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 4000);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Check that no more rules than expected have matched 
                assertThat(results).hasSize(1); 

                // Check that expected outputs are returned 
                List<Map<String, Object>> result = results.getResultList(); 
                List<Map<String, Object>> expectedResults = Arrays.asList( 
                        ImmutableMap.of("eligibility", "Approved")
                ); 
                assertThat(result).containsExactlyInAnyOrderElementsOf(expectedResults); 
        }

        @Test
        public void testDmnDecisionEvaluationForTestCase8() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 4000);

                // Evaluate decision with id from file 
                DmnDecisionTableResult results = dmnEngine.evaluateDecisionTable(decision, variables);

                // Check that no more rules than expected have matched 
                assertThat(results).hasSize(1); 

                // Check that expected outputs are returned 
                List<Map<String, Object>> result = results.getResultList(); 
                List<Map<String, Object>> expectedResults = Arrays.asList( 
                        ImmutableMap.of("eligibility", "Approved")
                ); 
                assertThat(result).containsExactlyInAnyOrderElementsOf(expectedResults); 
        }

}
