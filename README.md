# My Money Planner Android project (Quick Add assistant)
Upload the contents of this folder to the root of your GitHub repository, preserving `.github/workflows/build-apk.yml` and the `app/` structure. Commit to `main`, then go to Actions → Build Android APK → Run workflow. Download the `My-Money-Planner-APK` artifact after a successful run.

Quick Add currently uses an offline, rule-based parser for common expense, Axis savings, and investment commands. It is not a generative AI model yet. A true AI agent needs a secure backend/API key; do not embed a private API key in the APK. All tracker data stays in local app storage. No bank integrations or automatic transfers.
