# Java Sample Test App

A sample repository used to demonstrate the **Central AI DevOps Failure Triage Agent**.

## Pipeline Details
* **Workflow:** `.github/workflows/ci.yml`
* **Trigger:** Push, PR, and Workflow Dispatch
* **Source:** `src/main/java/com/demo/TestingCode.java`
* **Expected Result:** Deliberate compilation syntax error on line 13 (`')' expected`) to trigger automated triage.
