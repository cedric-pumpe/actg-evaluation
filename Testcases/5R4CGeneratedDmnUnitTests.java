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
                        .putValue("age", 0)
                        .putValue("income", 0)
                        .putValue("debt", 0)
                        .putValue("married", false);

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
                        .putValue("age", 25)
                        .putValue("income", 1999)
                        .putValue("debt", 10000)
                        .putValue("married", false);

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
                        .putValue("age", 0)
                        .putValue("income", 0)
                        .putValue("debt", 10001)
                        .putValue("married", true);

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
                        .putValue("age", 25)
                        .putValue("income", 1999)
                        .putValue("debt", 19999)
                        .putValue("married", true);

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
                        .putValue("age", 0)
                        .putValue("income", 2000)
                        .putValue("debt", 0)
                        .putValue("married", false);

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
                        .putValue("age", 25)
                        .putValue("income", 3999)
                        .putValue("debt", 5000)
                        .putValue("married", false);

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
                        .putValue("age", 0)
                        .putValue("income", 1999)
                        .putValue("debt", 5001)
                        .putValue("married", true);

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
                        .putValue("age", 25)
                        .putValue("income", 3999)
                        .putValue("debt", 14999)
                        .putValue("married", true);

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
                        .putValue("age", 0)
                        .putValue("income", 40000)
                        .putValue("debt", 0)
                        .putValue("married", false);

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
        public void testDmnDecisionEvaluationForTestCase10() {

                // Get DMN engine
                DmnEngine dmnEngine = rule.getDmnEngine();

                // Parse decision
                InputStream inputStream = getClass().getResourceAsStream("/diagram.dmn");

                DmnDecision decision = dmnEngine.parseDecision("Decision_0unyeeo", inputStream);

                // Set input variables
                VariableMap variables = Variables.createVariables()
                        .putValue("age", 25)
                        .putValue("income", 40000)
                        .putValue("debt", 15000)
                        .putValue("married", false);

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
