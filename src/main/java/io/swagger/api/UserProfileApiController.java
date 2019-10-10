package io.swagger.api;

import io.swagger.model.UserProfile;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-09T04:26:08.933Z")

@Controller
public class UserProfileApiController implements UserProfileApi {

    private static final Logger log = LoggerFactory.getLogger(UserProfileApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserProfileApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addUserProfile(@ApiParam(value = "user profile object that needs to be added to the store" ,required=true )  @Valid @RequestBody UserProfile body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUserProfile(@ApiParam(value = "User profile id to delete",required=true) @PathVariable("userProfileId") Long userProfileId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UserProfile> getUserProfileById(@ApiParam(value = "ID of profile to return",required=true) @PathVariable("userProfileId") Long userProfileId) {
        String accept = request.getHeader("Accept");
        UserProfile up = new UserProfile();
        up.setId(userProfileId);
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<UserProfile>(up, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<UserProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserProfile>(up, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        

        return new ResponseEntity<UserProfile>(up,HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUserProfile(@ApiParam(value = "user profile object that needs to be uploaded" ,required=true )  @Valid @RequestBody UserProfile body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUserProfileWithForm(@ApiParam(value = "ID of user profile that needs to be updated",required=true) @PathVariable("userProfileId") Long userProfileId,@ApiParam(value = "Updated name of the user profile") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the user profile") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
