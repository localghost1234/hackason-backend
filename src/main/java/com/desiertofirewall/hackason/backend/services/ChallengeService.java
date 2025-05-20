package com.desiertofirewall.hackason.backend.services;

import com.desiertofirewall.hackason.backend.models.Challenge;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ChallengeService {

    private final List<Challenge> mockChallenges = Arrays.asList(
        new Challenge("xss-1", "DOM XSS Challenge", 
            "Exploit a client-side XSS vulnerability in a search function",
            "Web Security", "Medium", 250, false,
            "https://demo.testfire.net/search.aspx"),
            
        new Challenge("xss-2", "Stored XSS in Comments", 
            "Inject persistent XSS through a comment form",
            "Web Security", "Beginner", 150, true,
            "https://xss-game.appspot.com/level1"),
            
        new Challenge("sqli-1", "Basic SQL Injection", 
            "Bypass login using SQL injection",
            "Web Security", "Beginner", 200, true,
            "https://demo.testfire.net/login.jsp"),
            
        new Challenge("sqli-2", "Blind SQLi", 
            "Extract database information using boolean-based blind SQLi",
            "Web Security", "Advanced", 450, false,
            "https://example.com/blind-sqli-lab"),
            
        new Challenge("crypto-1", "Weak Encryption", 
            "Break a homebrew encryption algorithm",
            "Cryptography", "Medium", 300, true,
            "https://example.com/weak-crypto-lab"),
            
        new Challenge("crypto-2", "Padding Oracle", 
            "Exploit a padding oracle vulnerability",
            "Cryptography", "Advanced", 500, false,
            "https://example.com/padding-oracle-lab"),
            
        new Challenge("crypto-3", "RSA Key Extraction", 
            "Extract private key from a poorly implemented RSA system",
            "Cryptography", "Advanced", 500, true,
            "https://example.com/crypto-lab"),
            
        new Challenge("misc-1", "JWT Tampering", 
            "Modify JWT tokens to escalate privileges",
            "Web Security", "Medium", 350, true,
            "https://example.com/jwt-lab"),
            
        new Challenge("misc-2", "CSRF Exploit", 
            "Perform actions as another user via CSRF",
            "Web Security", "Medium", 300, false,
            "https://example.com/csrf-lab"),
            
        new Challenge("misc-3", "File Upload Bypass", 
            "Upload a malicious file by bypassing filters",
            "Web Security", "Advanced", 400, true,
            "https://example.com/upload-lab"),
            
        new Challenge("misc-4", "SSRF Exploit", 
            "Access internal services via Server-Side Request Forgery",
            "Web Security", "Advanced", 450, false,
            "https://example.com/ssrf-lab"),
            
        new Challenge("re-1", "Basic Reverse Engineering", 
            "Analyze a binary to find the secret key",
            "Reverse Engineering", "Beginner", 200, true,
            "https://example.com/re-basic-lab"),
            
        new Challenge("re-2", "Obfuscated JavaScript", 
            "Deobfuscate malicious JavaScript code",
            "Reverse Engineering", "Medium", 350, false,
            "https://example.com/js-obfuscation-lab"),
            
        new Challenge("pwn-1", "Buffer Overflow", 
            "Exploit a simple stack-based buffer overflow",
            "Binary Exploitation", "Advanced", 500, true,
            "https://example.com/bof-lab"),
            
        new Challenge("osint-1", "User Recon", 
            "Find hidden information about a user from public sources",
            "OSINT", "Beginner", 150, false,
            "https://example.com/osint-lab")
    );

    public List<Challenge> getAllChallenges() {
        return mockChallenges;
    }
}