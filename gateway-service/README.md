# Api Gateway Service
#### Spring Netflix Zuul Api Gateway served on http://localhost:8080
#### Registered with the Eureka Discovery Service
#### Proxies requests to downstream services (i.e. http://localhost:8080/sample-client/ proxies to sample-client service root)
#### AddRequestHeader intercepts requests with a "pre" filter and adds a custom x-location header