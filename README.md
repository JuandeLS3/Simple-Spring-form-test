# Spring Form Test

Simple form using spring framework and redis as a cache database. 

## Requirements
- BD Redis
- Maven
- Python and pip (for redis dependency)
## How to use
First, run the python script "datos_redis.py" (it will be necessary to install the redis dependency for python if you do not have it)

		$pip install redis
			

Once installed, launch the script.

		$python datos_redis.py

Package from maven or eclipse with the goal jetty:run to start the embedded jetty server, from the root of the project.

		$mvn jetty:run

Access through the browser to the following address:

		http://localhost:9999/employee

The final textarea data will be collected through **the console**

