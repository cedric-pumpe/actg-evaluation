package de.wwu.dmnHelper.Tests;

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

public class GeneratedDmnUnitTests {

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
        public void testDmnDecisionEvaluationForTestCase3() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 1);

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
        public void testDmnDecisionEvaluationForTestCase4() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 1);

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
        public void testDmnDecisionEvaluationForTestCase5() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 2);

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
                        .putValue("income", 2);

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
        public void testDmnDecisionEvaluationForTestCase7() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 3);

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
                        .putValue("income", 3);

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
        public void testDmnDecisionEvaluationForTestCase9() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 4);

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
        public void testDmnDecisionEvaluationForTestCase10() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 4);

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
        public void testDmnDecisionEvaluationForTestCase11() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 5);

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
        public void testDmnDecisionEvaluationForTestCase12() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 5);

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
        public void testDmnDecisionEvaluationForTestCase13() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 6);

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
        public void testDmnDecisionEvaluationForTestCase14() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 6);

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
        public void testDmnDecisionEvaluationForTestCase15() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 7);

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
        public void testDmnDecisionEvaluationForTestCase16() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 7);

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
        public void testDmnDecisionEvaluationForTestCase17() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 8);

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
        public void testDmnDecisionEvaluationForTestCase18() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 8);

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
        public void testDmnDecisionEvaluationForTestCase19() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 9);

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
        public void testDmnDecisionEvaluationForTestCase20() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 9);

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
        public void testDmnDecisionEvaluationForTestCase21() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 10);

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
        public void testDmnDecisionEvaluationForTestCase22() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 10);

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
        public void testDmnDecisionEvaluationForTestCase23() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 11);

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
        public void testDmnDecisionEvaluationForTestCase24() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 11);

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
        public void testDmnDecisionEvaluationForTestCase25() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 12);

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
        public void testDmnDecisionEvaluationForTestCase26() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 12);

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
        public void testDmnDecisionEvaluationForTestCase27() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 13);

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
        public void testDmnDecisionEvaluationForTestCase28() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 13);

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
        public void testDmnDecisionEvaluationForTestCase29() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 14);

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
        public void testDmnDecisionEvaluationForTestCase30() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 14);

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
        public void testDmnDecisionEvaluationForTestCase31() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 15);

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
        public void testDmnDecisionEvaluationForTestCase32() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 15);

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
        public void testDmnDecisionEvaluationForTestCase33() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 16);

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
        public void testDmnDecisionEvaluationForTestCase34() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 16);

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
        public void testDmnDecisionEvaluationForTestCase35() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 17);

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
        public void testDmnDecisionEvaluationForTestCase36() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 17);

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
        public void testDmnDecisionEvaluationForTestCase37() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 18);

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
        public void testDmnDecisionEvaluationForTestCase38() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 18);

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
        public void testDmnDecisionEvaluationForTestCase39() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 19);

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
        public void testDmnDecisionEvaluationForTestCase40() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 19);

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
        public void testDmnDecisionEvaluationForTestCase41() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 20);

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
        public void testDmnDecisionEvaluationForTestCase42() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 20);

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
        public void testDmnDecisionEvaluationForTestCase43() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 21);

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
        public void testDmnDecisionEvaluationForTestCase44() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 21);

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
        public void testDmnDecisionEvaluationForTestCase45() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 22);

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
        public void testDmnDecisionEvaluationForTestCase46() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 22);

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
        public void testDmnDecisionEvaluationForTestCase47() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 23);

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
        public void testDmnDecisionEvaluationForTestCase48() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 23);

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
        public void testDmnDecisionEvaluationForTestCase49() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 24);

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
        public void testDmnDecisionEvaluationForTestCase50() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 24);

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
        public void testDmnDecisionEvaluationForTestCase51() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 25);

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
        public void testDmnDecisionEvaluationForTestCase52() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 25);

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
        public void testDmnDecisionEvaluationForTestCase53() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 26);

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
        public void testDmnDecisionEvaluationForTestCase54() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 26);

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
        public void testDmnDecisionEvaluationForTestCase55() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 27);

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
        public void testDmnDecisionEvaluationForTestCase56() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 27);

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
        public void testDmnDecisionEvaluationForTestCase57() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 28);

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
        public void testDmnDecisionEvaluationForTestCase58() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 28);

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
        public void testDmnDecisionEvaluationForTestCase59() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 29);

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
        public void testDmnDecisionEvaluationForTestCase60() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 29);

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
        public void testDmnDecisionEvaluationForTestCase61() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 30);

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
        public void testDmnDecisionEvaluationForTestCase62() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 30);

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
        public void testDmnDecisionEvaluationForTestCase63() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 31);

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
        public void testDmnDecisionEvaluationForTestCase64() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 31);

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
        public void testDmnDecisionEvaluationForTestCase65() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 32);

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
        public void testDmnDecisionEvaluationForTestCase66() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 32);

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
        public void testDmnDecisionEvaluationForTestCase67() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 33);

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
        public void testDmnDecisionEvaluationForTestCase68() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 33);

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
        public void testDmnDecisionEvaluationForTestCase69() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 34);

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
        public void testDmnDecisionEvaluationForTestCase70() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 34);

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
        public void testDmnDecisionEvaluationForTestCase71() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 35);

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
        public void testDmnDecisionEvaluationForTestCase72() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 35);

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
        public void testDmnDecisionEvaluationForTestCase73() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 36);

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
        public void testDmnDecisionEvaluationForTestCase74() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 36);

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
        public void testDmnDecisionEvaluationForTestCase75() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 37);

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
        public void testDmnDecisionEvaluationForTestCase76() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 37);

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
        public void testDmnDecisionEvaluationForTestCase77() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 38);

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
        public void testDmnDecisionEvaluationForTestCase78() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 38);

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
        public void testDmnDecisionEvaluationForTestCase79() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 39);

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
        public void testDmnDecisionEvaluationForTestCase80() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 39);

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
        public void testDmnDecisionEvaluationForTestCase81() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 40);

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
        public void testDmnDecisionEvaluationForTestCase82() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 40);

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
        public void testDmnDecisionEvaluationForTestCase83() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 41);

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
        public void testDmnDecisionEvaluationForTestCase84() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 41);

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
        public void testDmnDecisionEvaluationForTestCase85() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 42);

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
        public void testDmnDecisionEvaluationForTestCase86() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 42);

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
        public void testDmnDecisionEvaluationForTestCase87() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 43);

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
        public void testDmnDecisionEvaluationForTestCase88() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 43);

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
        public void testDmnDecisionEvaluationForTestCase89() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 44);

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
        public void testDmnDecisionEvaluationForTestCase90() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 44);

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
        public void testDmnDecisionEvaluationForTestCase91() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 45);

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
        public void testDmnDecisionEvaluationForTestCase92() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 45);

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
        public void testDmnDecisionEvaluationForTestCase93() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 46);

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
        public void testDmnDecisionEvaluationForTestCase94() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 46);

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
        public void testDmnDecisionEvaluationForTestCase95() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 47);

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
        public void testDmnDecisionEvaluationForTestCase96() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 47);

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
        public void testDmnDecisionEvaluationForTestCase97() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 48);

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
        public void testDmnDecisionEvaluationForTestCase98() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 48);

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
        public void testDmnDecisionEvaluationForTestCase99() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 49);

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
        public void testDmnDecisionEvaluationForTestCase100() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("income", 49);

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

}
