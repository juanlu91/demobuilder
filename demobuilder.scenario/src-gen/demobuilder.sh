#!/bin/bash
USER="DemoMaster"
PASS="DemoMaster"
WORKSPACE_NAME="Workspace"
curl -k -basic -u $USER:$PASS https://localhost:8181/IDEAS/file/createWorkspace?workspaceName=$WORKSPACE_NAME
PROJECT_NAME="Amazon"
curl -k -basic -u $USER:$PASS https://localhost:8181/IDEAS/file/createProject?projectUri=$WORKSPACE_NAME/$PROJECT_NAME
			
				
FILE_NAME="basicPlan.at"
FILE_URI="$WORKSPACE_NAME/$PROJECT_NAME/$FILE_NAME"
curl -k -basic -u $USER:$PASS -H "Accept: application/json" -H "Content-Type:application/json" https://localhost:8181/IDEAS/file/createFile?fileUri=$FILE_URI
curl -k -u $USER:$PASS -X POST -d "fileUri=$FILE_URI" -d "fileContent=$(cat $FILE_NAME)" https://localhost:8181/IDEAS/file/setFileContent
				
FILE_NAME="mediumPlan.at"
FILE_URI="$WORKSPACE_NAME/$PROJECT_NAME/$FILE_NAME"
curl -k -basic -u $USER:$PASS -H "Accept: application/json" -H "Content-Type:application/json" https://localhost:8181/IDEAS/file/createFile?fileUri=$FILE_URI
curl -k -u $USER:$PASS -X POST -d "fileUri=$FILE_URI" -d "fileContent=$(cat $FILE_NAME)" https://localhost:8181/IDEAS/file/setFileContent
				
