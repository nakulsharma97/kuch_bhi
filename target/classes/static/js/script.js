console.log("Script loaded successfully!");

// get theme from localStorage
let currentTheme = getTheme();



document.addEventListener('DOMContentLoaded', function() {
  changeTheme(currentTheme);
    console.log('The page has loaded!');
  // Your code goes here
});



// apply theme
changeTheme(currentTheme);

function changeTheme(currentTheme) {

    // apply theme on page
    document.querySelector("html").classList.add(currentTheme);

    // update button appearance initially
    updateButtonText(currentTheme);

    // theme toggle button
    const changeThemeButton = document.querySelector("#theme_change_button");

    changeThemeButton.addEventListener("click", () => {

        console.log("Button clicked");

        const oldTheme = currentTheme;

        if (currentTheme === "dark") {
            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }

        // update localStorage
        setTheme(currentTheme);

        // remove old theme
        document.querySelector("html").classList.remove(oldTheme);

        // add new theme
        document.querySelector("html").classList.add(currentTheme);

        // update button text
        updateButtonText(currentTheme);
    });
}

// Update button text and icon based on current theme
function updateButtonText(theme) {
    const button = document.querySelector("#theme_change_button");
    if (!button) return;

    const icon = button.querySelector("i");
    const span = button.querySelector("span");

    if (theme === "dark") {
        if (icon) icon.className = "fa-solid fa-moon";
        if (span) span.textContent = "Dark";
    } else {
        if (icon) icon.className = "fa-regular fa-lightbulb";
        if (span) span.textContent = "Light";
    }
}


// store theme in localStorage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}


// get theme from localStorage
function getTheme() {

    let theme = localStorage.getItem("theme");

    if (theme) {
        return theme;
    } else {
        return "light";
    }
}