#!/bin/bash
cat install/input.txt | bash install/installgh.sh
# Replace swerve-template with repo to clone
gh repo clone FRCTeam4909/swerve-template