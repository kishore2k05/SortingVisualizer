
# Sorting Visualizer 💻

Sorting Visualizer is an interactive web-based project that brings sorting algorithms and core Data Structures & Algorithms ($\text{DSA}$) concepts to life. It uses a **simple Java backend server** along with a **JavaScript-powered frontend** to dynamically visualize how algorithms operate step by step.

This project is designed to help learners, students, and developers not only **see how algorithms work in real-time**, but also to interact with them, customize parameters, and compare their efficiency.

-----

## 🚀 Features

  - 🎨 **Interactive Visualizations**

      - **Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, Heap Sort** (with room for more).
      - Step-by-step graphical representation of element swaps, comparisons, and array transformations.

  - ⚡ **Simple Java $\text{REST APIs}$**

      - Backend APIs written in **Java ($\text{simplesortserver.java}$)** to handle algorithm execution.
      - APIs return sorting results, execution time, number of comparisons, and other metrics.
      - Extensible architecture for adding new algorithms.

  - 🎛️ **Customizable Controls**

      - Adjust **speed** of visualization.
      - Change **array size** and value range.
      - Pause, play, or reset the visualization at any time.

  - 📊 **Performance Insights**

      - Displays **time complexity** and execution statistics for each algorithm.
      - Enables comparison between algorithms in terms of speed and efficiency.

  - 📈 **Future Expansion ($\text{DSA Modules}$)**

      - Searching algorithms (Linear, Binary Search).
      - Stack & Queue operations.
      - Tree and Graph traversal visualizations ($\text{BFS}$, $\text{DFS}$, etc.).

-----

## ⚙️ Getting Started (Running the Backend)

The backend algorithm logic is served by a standalone $\text{Java}$ application, simplifying the build and execution process.

### Prerequisites

  * **Java Development Kit ($\text{JDK}$):** Version 8 or higher.

### Backend Setup and Launch

1.  **Navigate to the Backend Directory:**
    Change your current directory to the location of the $\text{simplesortserver.java}$ file.

    ```bash
    cd SortingVisualizer/backend # Adjust path if needed
    ```

2.  **Compile the Java File:**
    Use the $\text{javac}$ command to compile the Java source code into a $\text{.class}$ file.

    ```bash
    javac simplesortserver.java
    ```

3.  **Run the Server:**
    Execute the compiled Java class. This will start your server and listen for connections on **port 8000**.

    ```bash
    java simplesortserver
    ```

4.  **Verification:**
    The server is ready when you see the confirmation message in your console, indicating that:

    ```
    port 8000 is connected
    ```

-----

## 🛠️ Tech Stack

  - **Frontend**: HTML, CSS, **JavaScript** (for interactive visualizations)
  - **Backend**: **Simple Java Server** ($\text{simplesortserver.java}$)
  - **APIs**: $\text{RESTful APIs}$ for algorithm execution & metrics
  - **Others**: $\text{JSON}$ for $\text{API}$ responses, Modular design for easy addition of new algorithms

-----

## 🎯 Project Goals

  - Make learning algorithms engaging and visual rather than abstract.
  - Provide an $\text{API}$-driven system where backend logic and frontend visualization are cleanly separated.
  - Serve as both a **learning tool** and a **foundation project** for developers exploring $\text{DSA}$ and Java integration with web technologies.

-----

✨ With Sorting Visualizer, you don’t just learn algorithms — you actually **see them in action**\!
