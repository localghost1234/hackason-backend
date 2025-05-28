package com.desiertofirewall.hackason.backend.services;

import com.desiertofirewall.hackason.backend.models.Program;
import com.desiertofirewall.hackason.backend.models.Program.Rewards;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

@Service
public class ProgramsService {

    private final List<Program> mockPrograms = Arrays.asList(
        new Program(
            "google",
            "Google VDP",
            "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png",
            "Report vulnerabilities in Google services",
            true,
            "Web",
            "https://bughunters.google.com",
            LocalDate.of(2025, 9, 1), // 2023-10-01 (year since 1900)
            Arrays.asList("*.google.com", "*.youtube.com", "Android apps (Play Store distribution only)"),
            Arrays.asList("*.blogger.com", "Google Cloud physical infrastructure", "Social engineering"),
            new Rewards(15000, 8000, 2000, 500),
            "https://google.com/security",
            LocalDate.of(2024, 4, 1) // 2020-05-01
        ),
        new Program(
            "microsoft",
            "Microsoft Bounty Program",
            "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE1Mu3b",
            "Earn rewards for finding security vulnerabilities in Microsoft products and services. We welcome reports across our entire ecosystem.",
            true,
            "Cloud, OS, Software",
            "https://www.microsoft.com/msrc/bounty",
            LocalDate.of(2025, 8, 15),
            Arrays.asList("*.microsoft.com", "*.azure.com", "Windows 10/11 (latest builds)", "Microsoft 365 web applications", "Xbox Live services"),
            Arrays.asList("Microsoft Store apps (unless explicitly listed)", "Third-party integrations", "Social engineering/phishing", "Physical security testing", "DDoS vulnerabilities"),
            new Rewards(20000, 10000, 2500, 500),
            "https://www.microsoft.com/msrc/bounty-terms",
            LocalDate.of(2024, 5, 15)
        ),
        new Program(
            "apple",
            "Apple Security Bounty",
            "https://www.apple.com/ac/structured-data/images/knowledge_graph_logo.png?20230330",
            "Rewards for vulnerabilities in Apple operating systems, hardware, and services.",
            true,
            "Mobile, OS, Hardware",
            "https://developer.apple.com/security-bounty",
            LocalDate.of(2025, 10, 1),
            Arrays.asList("iOS/macOS kernel vulnerabilities", "iCloud web interfaces", "Secure Enclave", "Apple Pay implementation"),
            Arrays.asList("Third-party apps on App Store", "Beta/Pre-release software", "Physical device attacks"),
            new Rewards(25000, 15000, 5000, 1000),
            "https://support.apple.com/security-bounty",
            LocalDate.of(2024, 7, 1)
        ),
        new Program(
            "facebook",
            "Meta Bug Bounty",
            "https://upload.wikimedia.org/wikipedia/commons/7/7b/Meta_Platforms_Inc._logo.svg",
            "Rewards for security vulnerabilities affecting Facebook, Instagram, WhatsApp, and other Meta services.",
            true,
            "Social Media",
            "https://www.facebook.com/whitehat",
            LocalDate.of(2025, 9, 15),
            Arrays.asList("facebook.com domains", "Instagram Android/iOS apps", "WhatsApp Web", "Oculus Store payments"),
            Arrays.asList("Third-party integrations", "Social engineering", "Theoretical vulnerabilities"),
            new Rewards(30000, 15000, 3000, 500),
            "https://www.facebook.com/whitehat/bounty",
            LocalDate.of(2024, 6, 1)
        ),
        new Program(
            "tesla",
            "Tesla Vehicle Security",
            "https://www.tesla.com/themes/custom/tesla_frontend/assets/favicons/favicon-196x196.png",
            "Rewards for vulnerabilities affecting Tesla vehicles and energy products.",
            true,
            "Automotive",
            "https://www.tesla.com/bugbounty",
            LocalDate.of(2025, 8, 20),
            Arrays.asList("Vehicle firmware (latest versions)", "Tesla Mobile App", "Charging infrastructure", "Vehicle-to-Grid systems"),
            Arrays.asList("Physical vehicle damage", "Social engineering", "Third-party charging stations"),
            new Rewards(50000, 20000, 5000, 1000),
            "https://www.tesla.com/legal/security",
            LocalDate.of(2024, 9, 1)
        ),
        new Program(
            "uber",
            "Uber Bug Bounty",
            "https://upload.wikimedia.org/wikipedia/commons/5/58/Uber_logo_2018.svg",
            "Rewards for security vulnerabilities in Uber apps, services, and infrastructure.",
            true,
            "Transportation",
            "https://hackerone.com/uber",
            LocalDate.of(2025, 7, 10),
            Arrays.asList("uber.com domains", "Driver/Rider apps", "Payment processing", "Uber Eats restaurant portal"),
            Arrays.asList("Uber-owned websites without sensitive data", "Physical attacks on drivers", "Rate limiting/DDoS"),
            new Rewards(20000, 10000, 3000, 500),
            "https://www.uber.com/legal/security",
            LocalDate.of(2024, 4, 1)
        ),
        new Program(
            "coinbase",
            "Coinbase Security Program",
            "https://images.ctfassets.net/q5ulk4bp65r7/3TBS4oVkD1ghowTqVQJlqj/2dfd4ea3b623a7c0d8deb2ff445dee9e/Consumer_Wordmark.svg",
            "Rewards for vulnerabilities affecting Coinbase cryptocurrency exchange and wallet services.",
            true,
            "Blockchain",
            "https://hackerone.com/coinbase",
            LocalDate.of(2025, 10, 5),
            Arrays.asList("coinbase.com domains", "Mobile wallet apps", "Coinbase Pro API", "USD Coin (USDC) smart contracts"),
            Arrays.asList("Coinbase Commerce plugins", "Social engineering", "Blockchain protocol vulnerabilities"),
            new Rewards(50000, 25000, 5000, 500),
            "https://www.coinbase.com/security",
            LocalDate.of(2024, 2, 1)
        )
    );

    public List<Program> getAllPrograms() {
        return mockPrograms;
    }
}