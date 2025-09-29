# Sorting Visualizer 💻

Sorting Visualizer is an interactive web-based project that brings core Data Structures & Algorithms (DSA) concepts to life. It uses a **simple Java backend server** built on a native HTTP API, along with a **JavaScript-powered frontend** to dynamically visualize how sorting algorithms operate step by step.

This project is designed to help learners, students, and developers not only **see how algorithms work in real-time**, but also to interact with them and compare their operations.

## 🚀 Features

  * **🎨 Interactive Visualizations:** Features algorithms like **Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, and Quick Sort**. The frontend graphically represents element swaps and array transformations.
  * **⚡ Simple Java HTTP Endpoints:**
      * The backend is a lightweight server written in Java using the **native `com.sun.net.httpserver` API** (not a full REST framework).
      * Endoints (e.g., `/sort/bubble`) return a **pipe-delimited string** of array states (e.g., `[50, 10, 90, 30, 70]|[10, 50, 90, 30, 70]`) for the frontend to parse and animate.
      * The architecture is extensible for adding new algorithms (Heap Sort, etc.).
  * **🎛️ Customizable Controls:** Adjust visualization speed, and include options to pause, play, or reset.
  * **📊 Performance Insights:** Future feature to display time complexity and execution statistics for comparison.
  * **📈 Future Expansion (DSA Modules):** Planned modules for Searching algorithms, Stack & Queue operations, and Tree/Graph traversal visualizations (BFS, DFS).

## ⚙️ Getting Started (Running the Backend)

The backend algorithm logic is served by a standalone Java application, providing the array states needed for visualization.

### Prerequisites

  * **Java Development Kit (JDK):** Version 8 or higher.

### Backend Setup and Launch

1.  **Navigate to the Backend Directory:** Change your current directory to the location of the `simplesortserver.java` file.
    ```bash
    cd SortingVisualizer/backend # Adjust path if needed
    ```
2.  **Compile the Java File (and other algorithm classes):** Use the `javac` command to compile the main server file and all dependent algorithm classes (like `bubblesort.java`, `mergesort.java`, etc.) into `.class` files.
    ```bash
    javac simplesortserver.java *.java
    ```
3.  **Run the Server:** Execute the compiled Java class. This will start your HTTP server and listen for connections on **port 8000**.
    ```bash
    java simplesortserver
    ```
4.  **Verification:** The server is ready when you see the confirmation message in your console, indicating that:
    ```
    Java Server started on port 8000.
    ```
    *(Note: The server uses a hardcoded input array: `{50, 10, 90, 30, 70}`)*

## 🛠️ Tech Stack

  * **Frontend:** HTML, CSS, **JavaScript** (using the native `fetch` API for communication).
  * **Backend:** **Simple Java Server** (`simplesortserver.java`) utilizing the **native `com.sun.net.httpserver` API**.
  * **APIs:** **HTTP Endpoints** following a resource-based structure for step-by-step algorithm data.
  * **Data Format:** **Pipe-delimited strings** of array states for efficient visualization.

## 🎯 Project Goals

  * Make learning algorithms engaging and visual rather than abstract.
  * Provide an **HTTP-driven system** where backend logic and frontend visualization are cleanly separated.
  * Serve as both a **learning tool** and a **foundation project** for developers exploring DSA and lightweight Java server integration with web technologies.

✨ With Sorting Visualizer, you don’t just learn algorithms — you actually **see them in action\!**
