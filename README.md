# Spring Security
# Introduction:


-It is responsible for Application level security, basically it is a security framework
- 1. Login & logout functionality.
  2. Allow/block access to URLs to logged in users. 
  3. Allow/block access to URLs to logged in users & with certain roles. 
- Also, handles common vulnerabilities out of the box. 
- 1. Session fixation 
  2. Clickjacking
  3. Click site request forgery. 
  4. Also, since its widely adopted, popular target for hackers, making vulnerabilities getting most attention & quick response. 
5. What Spring Security can do ? 
   1. User name/password authenticaton
   2. SSO/Okta/LDAP
   3. App level Authorization
   4. Intra App Authorization like OAuth
   5. Microservice Security(using tokens, JWT)
   6. Method level security
4. Core concept :
   + Authentication : 
     + Knowledge based authentication : like Password, Pin code, secret question
       + Easy to implement & use
       + Not fully secure
     + Possession based authentication 
       + Phone/Text message
       + Key cards & badges 
       + Access token device
     + Multi-factor Authentication : 
       + Combination of Knowledge based & Possession based
   + Authorization : 
     + Can a user do a particular operation. 
   + Principal : 
     + A user identified logged in the system
     + One user can have multiple account, so essentially currently logged in account
   + Granted Authority: 
     + Allowed operations.
   + Roles : 
     + Group of Authorities
     + Are coarse-grained not very fine-grained.
# Spring Security:
+ MVN dependency :spring-boot-starter-security 
    + By Default behavior : 
      + Adds mandatory authentication for URLs
      + Adds login form
      + Handles login error
      + Creates a user & sets a default password(every run creates new password) & user = user, to override this we can add below properties: 
        + spring.security.user.name=test_user
        + spring.security.user.password=testing_password
    + Spring Security Filter :
