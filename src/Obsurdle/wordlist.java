import java.lang.invoke.ClassSpecializer.Factory;

import javax.naming.Binding;

public class wordlist {
    // provide by:
    String[] wordsLong = { "Ability", "Backing", "Cabinet",
            "Absence", "Balance", "Calibre",
            "Academy", "Banking", "Calling",
            "Account", "Barrier", "Capable",
            "Accused", "Battery", "Capital",
            "Achieve", "Bearing", "Captain",
            "Acquire", "Beating", "Caption",
            "Address", "Because", "Capture",
            "Advance", "Bedroom", "Careful",
            "Adverse", "Believe", "Carrier",
            "Advised", "Beneath", "Caution",
            "Adviser", "Benefit", "Ceiling",
            "Against", "Besides", "Central",
            "Airline", "Between", "Centric",
            "Airport", "Billion", "Century",
            "Alcohol", "Binding", "Certain",
            "Alleged", "Brother", "Chamber",
            "Already", "Brought", "Channel",
            "Analyst", "Burning", "Chapter",
            "Ancient", "Dealing", "Charity",
            "Another", "Decided", "Charlie",
            "Anxiety", "Decline", "Charter",
            "Anxious", "Default", "Checked",
            "Anybody", "Defence", "Chicken",
            "Applied", "Deficit", "Chronic",
            "Arrange", "Deliver", "Circuit",
            "Arrival", "Density", "Classes",
            "Article", "Deposit", "Classic",
            "Assault", "Desktop", "Climate",
            "Assumed", "Despite", "Closing",
            "Assured", "Destroy", "Closure",
            "Attempt", "Develop", "Clothes",
            "Attract", "Devoted", "Collect",
            "Auction", "Diamond", "College",
            "Average", "Digital", "Combine",
            "Eastern", "Discuss", "Comfort",
            "Economy", "Disease", "Command",
            "Edition", "Display", "Comment",
            "Elderly", "Dispute", "Compact",
            "Element", "Distant", "Company",
            "Engaged", "Diverse", "Compare",
            "Enhance", "Divided", "Compete",
            "Essence", "Drawing", "Complex",
            "Evening", "Driving", "Concept",
            "Evident", "Dynamic", "Concern",
            "Exactly", "Factory", "Concert",
            "Examine", "Faculty", "Conduct",
            "Example", "Failing", "Confirm",
            "Excited", "Failure", "Connect",
            "Exclude", "Fashion", "Consent",
            "Exhibit", "Feature", "Consist",
            "Expense", "Federal", "Contact",
            "Explain", "Feeling", "Contain",
            "Explore", "Fiction", "Content",
            "Express", "Fifteen", "Contest",
            "Extreme", "Filling", "Context",
            "Gallery", "Finance", "Control",
            "Gateway", "Finding", "Convert",
            "General", "Fishing", "Correct",
            "Genetic", "Fitness", "Council",
            "Genuine", "Foreign", "Counsel",
            "Gigabit", "Forever", "Counter",
            "Greater", "Formula", "Country",
            "Hanging", "Fortune", "Crucial",
            "Heading", "Forward", "Crystal",
            "Healthy", "Founder", "Culture",
            "Hearing", "Freedom", "Current",
            "Heavily", "Further", "Cutting",
            "Helpful", "Illegal", "Jointly",
            "Helping", "Illness", "Journal",
            "Herself", "Imagine", "Journey",
            "Highway", "Imaging", "Justice",
            "Himself", "Improve", "Justify",
            "History", "Include", "Keeping",
            "Holding", "Initial", "Killing",
            "Holiday", "Inquiry", "Kingdom",
            "Housing", "Insight", "Kitchen",
            "However", "Install", "Knowing",
            "Hundred", "Instant", "Machine",
            "Husband", "Instead", "Manager",
            "Landing", "Intense", "Married",
            "Largely", "Interim", "Massive",
            "Lasting", "Involve", "Maximum",
            "Leading", "Natural", "Meaning",
            "Learned", "Neither", "Measure",
            "Leisure", "Nervous", "Medical",
            "Liberal", "Network", "Meeting",
            "Liberty", "Neutral", "Mention",
            "Library", "Notable", "Message",
            "License", "Nothing", "Million",
            "Limited", "Nowhere", "Mineral",
            "Listing", "Nuclear", "Minimal",
            "Logical", "Nursing", "Minimum",
            "Loyalty", "Pacific", "Missing",
            "Obvious", "Package", "Mission",
            "Offence", "Painted", "Mistake",
            "Officer", "Parking", "Mixture",
            "Ongoing", "Partial", "Monitor",
            "Opening", "Partner", "Monthly",
            "Operate", "Passage", "Morning",
            "Opinion", "Passing", "Musical",
            "Optical", "Passion", "Mystery",
            "Organic", "Passive", "Portion",
            "Outcome", "Patient", "Poverty",
            "Outdoor", "Pattern", "Precise",
            "Outlook", "Payable", "Predict",
            "Outside", "Payment", "Premier",
            "Overall", "Penalty", "Premium",
            "Proudly", "Pending", "Prepare",
            "Project", "Pension", "Present",
            "Promise", "Pealing", "Prevent",
            "Promote", "Perfect", "Primary",
            "Protect", "Perform", "Printer",
            "Protein", "Perhaps", "Privacy",
            "Protest", "Phoenix", "Private",
            "Provide", "Picking", "Problem",
            "Publish", "Picture", "Proceed",
            "Purpose", "Pioneer", "Process",
            "Pushing", "Plastic", "Produce",
            "Qualify", "Pointed", "Product",
            "Quality", "Popular", "Profile",
            "Quarter", "Section", "Success",
            "Radical", "Segment", "Suggest",
            "Railway", "Serious", "Summary",
            "Readily", "Service", "Support",
            "Reading", "Serving", "Suppose",
            "Reality", "Session", "Supreme",
            "Realise", "Setting", "Surface",
            "Receipt", "Seventh", "Surgery",
            "Receive", "Several", "Surplus",
            "Recover", "Shortly", "Survive",
            "Reflect", "Showing", "Suspect",
            "Regular", "Silence", "Sustain",
            "Related", "Silicon", "Teacher",
            "Release", "Similar", "Telecom",
            "Remains", "Sitting", "Telling",
            "Removal", "Sixteen", "Tension",
            "Removed", "Skilled", "Theatre",
            "Replace", "Smoking", "Therapy",
            "Request", "Society", "Thereby",
            "Require", "Somehow", "Thought",
            "Reserve", "Someone", "Through",
            "Resolve", "Speaker", "Tonight",
            "Respect", "Special", "Totally",
            "Respond", "Species", "Touched",
            "Restore", "Sponsor", "Towards",
            "Retired", "Station", "Traffic",
            "Revenue", "Storage", "Trouble",
            "Reverse", "Strange", "Turning",
            "Rollout", "Stretch", "Typical",
            "Routine", "Student", "Uniform",
            "Running", "Studied", "Unknown",
            "Satisfy", "Subject", "Unusual",
            "Science", "Succeed", "Upgrade",
            "Walking", "Whether", "Upscale",
            "Wanting", "Willing", "Utility",
            "Warning", "Winning", "Variety",
            "Warrant", "Without", "Various",
            "Wearing", "Witness", "Vehicle",
            "Weather", "Working", "Venture",
            "Webcast", "Writing", "Version",
            "Website", "Written", "Veteran",
            "Wedding", "Western", "Victory",
            "Weekend", "Whereas", "Viewing",
            "Welcome", "Whereby", "Village",
            "Welfare", "Virtual", "Violent",
            "Visible", "Waiting" };
}