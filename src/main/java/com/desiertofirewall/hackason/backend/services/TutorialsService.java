package com.desiertofirewall.hackason.backend.services;

import com.desiertofirewall.hackason.backend.models.Tutorial;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TutorialsService {

    private final List<Tutorial> mockTutorials = Arrays.asList(
            new Tutorial("1", "Metasploit Framework Crash Course", "https://youtu.be/abc123",
                "https://img.youtube.com/vi/abc123/mqdefault.jpg", "15:22", "Beginner",
                "Metasploit", "Exploitation", "Learn basic Metasploit modules",
                LocalDate.of(2023, 9, 10)),

            new Tutorial("2", "XSS for Beginners", "https://youtu.be/def456",
                "https://img.youtube.com/vi/def456/mqdefault.jpg", "10:05", "Beginner",
                "Burp Suite", "XSS", "Cross-site scripting fundamentals",
                LocalDate.of(2023, 10, 1)),

            new Tutorial("3", "Wi-Fi Hacking with Aircrack-ng", "https://youtu.be/jkl012",
                "https://img.youtube.com/vi/jkl012/mqdefault.jpg", "18:30", "Medium",
                "Aircrack-ng", "Wireless", "Crack WPA2 passwords using Aircrack-ng",
                LocalDate.of(2023, 11, 5)),

            new Tutorial("4", "Advanced SQL Injection with SQLmap", "https://youtu.be/mno345",
                "https://img.youtube.com/vi/mno345/mqdefault.jpg", "25:12", "Advanced",
                "SQLmap", "Injection", "Automate SQLi attacks with SQLmap",
                LocalDate.of(2023, 11, 20)),

            new Tutorial("5", "Reverse Engineering Malware with Ghidra", "https://youtu.be/pqr678",
                "https://img.youtube.com/vi/pqr678/mqdefault.jpg", "30:50", "Advanced",
                "Ghidra", "Reverse Engineering", "Decompile and analyze malware samples",
                LocalDate.of(2023, 12, 10)),

            new Tutorial("6", "OSINT: Find Hidden Data with Maltego", "https://youtu.be/stu901",
                "https://img.youtube.com/vi/stu901/mqdefault.jpg", "12:15", "Beginner",
                "Other", "OSINT", "Map relationships using open-source intelligence",
                LocalDate.of(2024, 1, 5)),

            new Tutorial("7", "Network Scanning with Nmap", "https://youtu.be/vwx234",
                "https://img.youtube.com/vi/vwx234/mqdefault.jpg", "14:18", "Beginner",
                "Nmap", "Network", "Learn basic network scanning techniques with Nmap",
                LocalDate.of(2024, 1, 15)),

            new Tutorial("8", "Web App Testing with OWASP ZAP", "https://youtu.be/yza890",
                "https://img.youtube.com/vi/yza890/mqdefault.jpg", "22:40", "Medium",
                "OWASP ZAP", "Web Security", "Automated scanning and manual testing of web applications",
                LocalDate.of(2024, 2, 1)),

            new Tutorial("9", "Password Cracking with Hashcat", "https://youtu.be/bcd123",
                "https://img.youtube.com/vi/bcd123/mqdefault.jpg", "19:55", "Advanced",
                "Hashcat", "Password Cracking", "Advanced password cracking techniques using Hashcat",
                LocalDate.of(2024, 2, 10)),

            new Tutorial("10", "Python for Security Automation", "https://youtu.be/cde456",
                "https://img.youtube.com/vi/cde456/mqdefault.jpg", "28:12", "Medium",
                "Python (Security Scripting)", "Programming", "Automate security tasks with Python scripts",
                LocalDate.of(2024, 2, 20)),

            new Tutorial("11", "Packet Analysis with Wireshark", "https://youtu.be/efg789",
                "https://img.youtube.com/vi/efg789/mqdefault.jpg", "17:30", "Medium",
                "Wireshark", "Network", "Analyze network traffic and detect anomalies",
                LocalDate.of(2024, 3, 5)),

            new Tutorial("12", "Advanced Burp Suite Techniques", "https://youtu.be/fgh012",
                "https://img.youtube.com/vi/fgh012/mqdefault.jpg", "32:45", "Advanced",
                "Burp Suite", "Web Security", "Master advanced features of Burp Suite for web testing",
                LocalDate.of(2024, 3, 15)),

            new Tutorial("13", "Creating Custom Metasploit Modules", "https://youtu.be/hij345",
                "https://img.youtube.com/vi/hij345/mqdefault.jpg", "26:20", "Advanced",
                "Metasploit", "Exploitation", "Develop your own Metasploit modules in Ruby",
                LocalDate.of(2024, 4, 1)),

            new Tutorial("14", "Nmap Scripting Engine (NSE) Deep Dive", "https://youtu.be/jkl678",
                "https://img.youtube.com/vi/jkl678/mqdefault.jpg", "21:15", "Medium",
                "Nmap", "Network", "Write and use custom NSE scripts for advanced scanning",
                LocalDate.of(2024, 4, 10)),

            new Tutorial("15", "Building Security Tools with Python", "https://youtu.be/lmn901",
                "https://img.youtube.com/vi/lmn901/mqdefault.jpg", "35:50", "Advanced",
                "Python (Security Scripting)", "Programming", "Create custom security tools from scratch",
                LocalDate.of(2024, 4, 20)),

            new Tutorial("16", "Advanced OSINT Techniques", "https://youtu.be/nop234",
                "https://img.youtube.com/vi/nop234/mqdefault.jpg", "24:30", "Advanced",
                "Other", "OSINT", "Advanced open-source intelligence gathering methods",
                LocalDate.of(2024, 5, 1))
        );

    public List<Tutorial> getAllTutorials() {
        return mockTutorials;
    }

    public List<String> getUniqueCategories() {
        return mockTutorials.stream()
            .map(Tutorial::getCategory)
            .distinct()
            .collect(Collectors.toList());
    }

    public List<String> getUniqueTechnologies() {
        return mockTutorials.stream()
            .map(Tutorial::getTech)
            .distinct()
            .collect(Collectors.toList());
    }

    public List<Tutorial> getByCategory(String category) {
        return mockTutorials.stream()
            .filter(t -> t.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.toList());
    }

    public List<Tutorial> getByTech(String tech) {
        return mockTutorials.stream()
            .filter(t -> t.getTech().equalsIgnoreCase(tech))
            .collect(Collectors.toList());
    }

    public List<Tutorial> search(String query) {
        String lowerQuery = query.toLowerCase();
        return mockTutorials.stream()
            .filter(t -> t.getTitle().toLowerCase().contains(lowerQuery)
                      || t.getCategory().toLowerCase().contains(lowerQuery)
                      || t.getTech().toLowerCase().contains(lowerQuery))
            .collect(Collectors.toList());
    }
}